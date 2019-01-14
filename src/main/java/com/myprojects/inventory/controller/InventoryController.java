package com.myprojects.inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.inventory.domain.BookDTO;
import com.myprojects.inventory.domain.OrderDTO;
import com.myprojects.inventory.service.InventoryService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class InventoryController {
	
	private InventoryService inventoryService;
	
	private OrdersClient ordersClient;
	
	
	@PostMapping("/books")
	public BookDTO createBook(@RequestBody BookDTO bookDTO) {
		return inventoryService.createBook(bookDTO);
	}
	
	@GetMapping(value="/books")
	public List<BookDTO> getAllBooks() {
		return inventoryService.getAllBooks();		
	}
	
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
