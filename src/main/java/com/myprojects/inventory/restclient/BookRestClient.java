package com.myprojects.inventory.restclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.myprojects.inventory.domain.BookDTO;

@Service
public class BookRestClient {
	private final RestTemplate restTemplate;
	
	public BookRestClient(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public List<BookDTO> getBooks(){
		BookDTO[] booksDTOObjs =  restTemplate.getForObject("http://localhost:8080/books", BookDTO[].class);
		return Arrays.asList(booksDTOObjs);
	}
	
}
