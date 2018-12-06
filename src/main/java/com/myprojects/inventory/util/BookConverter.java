package com.myprojects.inventory.util;

import java.util.List;
import java.util.stream.Collectors;

import com.myprojects.inventory.domain.BookDTO;
import com.myprojects.inventory.entity.Book;

import lombok.experimental.UtilityClass;

@UtilityClass
public class BookConverter {

	public static List<BookDTO> convertBookListToBookDTOList(List<Book> books){
		return books.stream().map(BookConverter::convertBooktoBookDTO).collect(Collectors.toList());
	}
	
	public static BookDTO convertBooktoBookDTO(Book book) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setId(book.getId());
		bookDTO.setAuthor(book.getAuthor());
		bookDTO.setIsbn(book.getIsbn());
		bookDTO.setPublished_date(book.getPublished_date());
		bookDTO.setTitle(book.getTitle());
		return bookDTO;
	} 
	
	public static Book convertBookDTOToBook(BookDTO bookDTO) {
		Book book = new Book();
		book.setId(bookDTO.getId());
		book.setAuthor(bookDTO.getAuthor());
		book.setIsbn(bookDTO.getIsbn());
		book.setPublished_date(bookDTO.getPublished_date());
		book.setTitle(bookDTO.getTitle());
		return book;
	}
}
