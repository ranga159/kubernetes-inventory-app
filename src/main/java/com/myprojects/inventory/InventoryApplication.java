package com.myprojects.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@SpringBootApplication
@EnableJpaAuditing
@EnableSwagger2
public class InventoryApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InventoryApplication.class);
    }
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.any())
                .paths(paths()) // paths method defined below restricts the end points from being included in the documentation
                .build().enableUrlTemplating(true);
    }

    private Predicate<String> paths() { // paths, predicates
        Predicate<String> privateEndpoints = Predicates.not(PathSelectors.ant("/private/**"));
        Predicate<String> errors = Predicates.not(PathSelectors.ant("/error/**"));

        return Predicates.and(privateEndpoints, errors);
    }
}
