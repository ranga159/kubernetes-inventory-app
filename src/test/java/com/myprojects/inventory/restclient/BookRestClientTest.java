package com.myprojects.inventory.restclient;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.myprojects.inventory.InventoryApplication;
import com.myprojects.inventory.domain.BookDTO;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRestClientTest {

	@Autowired
	private BookRestClient bookClient;
	
   /* @Autowired
    private MockRestServiceServer server;*/
	
	
	@Test
	public void test() {
		
//		List<BookDTO> bookDTOs = this.bookClient.getBooks();
		
	}

}
