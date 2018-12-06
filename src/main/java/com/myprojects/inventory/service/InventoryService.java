package com.myprojects.inventory.service;

import java.util.List;

import com.myprojects.inventory.domain.BookDTO;

public interface InventoryService {
	List<BookDTO> getAllBooks();
	BookDTO getBook(Long bookId);
	List<BookDTO> getBooksInStock();
	BookDTO createBook(BookDTO bookDTO);
	//Book updateBook(Book book);
}
