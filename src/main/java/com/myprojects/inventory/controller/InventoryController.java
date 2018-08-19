package com.myprojects.inventory.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.inventory.entity.Book;

@RestController
public class InventoryController {
	
	@GetMapping(value="/books")
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		Book book = new Book(1,"first book");
		books.add(book);		
		return books;
		
	}
}
