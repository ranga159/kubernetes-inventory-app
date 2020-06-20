package com.myprojects.inventory.controller;

import com.myprojects.inventory.domain.BookDTO;
import com.myprojects.inventory.domain.OrderDTO;
import com.myprojects.inventory.service.InventoryService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class InventoryController {
	
	private InventoryService inventoryService;
	
	private OrdersClient ordersClient;


	@ApiOperation("Create a book with author details")
	@PostMapping("/books")
	public BookDTO createBook(@RequestBody BookDTO bookDTO) {
		log.info("createBook method called");
		return inventoryService.createBook(bookDTO);
	}

	@ApiOperation("Get a list of all books")
	@GetMapping(value="/books")
	public List<BookDTO> getAllBooks() {
        log.info("getAllBooks method called");
		return inventoryService.getAllBooks();
	}

	@ApiOperation("Get details of particular book")
	@GetMapping("/books/{bookId}")
	public BookDTO getBook(@PathVariable String bookId) {
		return inventoryService.getBook(Long.valueOf(bookId));
	}
	
	@GetMapping(value="/books-in-stock")
	public List<BookDTO> getBooksInStock() {
		return inventoryService.getBooksInStock();		
	}
	
	@GetMapping(value="/feignclient/orders/")
	public List<OrderDTO> getListOfAllOrders(){
		return ordersClient.getListOfAllOrders();
	}
	
}
