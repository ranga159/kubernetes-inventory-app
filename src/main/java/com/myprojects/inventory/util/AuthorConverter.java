package com.myprojects.inventory.util;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.myprojects.inventory.domain.AuthorDTO;
import com.myprojects.inventory.domain.BookDTO;
import com.myprojects.inventory.entity.Author;
import com.myprojects.inventory.entity.Book;

public class AuthorConverter {

	public static AuthorDTO convertAuthorToAuthorDTO(Author author) {
		AuthorDTO authorDTO = new AuthorDTO();
		authorDTO.setId(author.getId());
		authorDTO.setFirstName(author.getFirstName());
		authorDTO.setLastName(author.getLastName());
/*		Set<Book> books = author.getBooks();
		List<BookDTO> bookDTOList = BookConverter.convertBookListToBookDTOList(books.stream().collect(Collectors.toList()));
		authorDTO.setBooks(bookDTOList.stream().collect(Collectors.toSet()));*/
		return authorDTO;
	}

	public static Author convertAuthorDTOToAuthor(AuthorDTO authorDTO) {
		Author author = new Author();
		author.setId(authorDTO.getId());
		author.setFirstName(authorDTO.getFirstName());
		author.setLastName(authorDTO.getLastName());
		List<Book> bookList = BookConverter.convertBookDTOListToBookList(authorDTO.getBooks().stream().collect(Collectors.toList()));
		author.setBooks(bookList.stream().collect(Collectors.toSet()));
		return author;
	}
}
