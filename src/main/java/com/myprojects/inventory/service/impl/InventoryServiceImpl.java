package com.myprojects.inventory.service.impl;

import com.myprojects.inventory.domain.BookDTO;
import com.myprojects.inventory.entity.Author;
import com.myprojects.inventory.entity.Book;
import com.myprojects.inventory.repository.BookRepository;
import com.myprojects.inventory.repository.AuthorRepository;
import com.myprojects.inventory.service.InventoryService;
import com.myprojects.inventory.util.BookConverter;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService{

	private BookRepository bookRepository;

	private AuthorRepository authorRepository;
	
	@Override
	public List<BookDTO> getAllBooks() {	
		List<Book> books = bookRepository.findAll();
		return BookConverter.convertBookListToBookDTOList(books);
	}
	
	public BookDTO getBook(Long bookId) {
		Optional<Book> book = bookRepository.findById(bookId);
		if(book.isPresent()) {
			return BookConverter.convertBooktoBookDTO(book.get());
		}else {
			throw new ResourceNotFoundException();
		}
			
	}
	
	@Override
	public List<BookDTO> getBooksInStock() {	
		List<Book> books = bookRepository.findAll();
		return BookConverter.convertBookListToBookDTOList(books);
	}
	
	@Override
	public BookDTO createBook(BookDTO bookDTO) {
		Book book = BookConverter.convertBookDTOToBook(bookDTO);
		Author author = book.getAuthor();
		book.setCreatedBy("default"); // remove these once column defaults are set
		book.setModifiedBy("default");
		author.setCreatedBy("default");
		author.setModifiedBy("default");

		authorRepository.save(book.getAuthor());
		Book bookSaved = bookRepository.save(book);
		return BookConverter.convertBooktoBookDTO(bookSaved);
	}
	
	
	// will implementing hash and equals in book entity  help to update book entity
	// instead of over riding?
/*	public Book updateBook(Book book) {
		Book bookExists = inventoryRepository.findById(book.getId()).orElseThrow(() -> new ResourceNotFoundException(String.format("Book with id %s not found", book.getId())));
		
		return book;
	}*/

}
