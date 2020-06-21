package com.myprojects.inventory.service.impl;

import com.myprojects.inventory.domain.BookDTO;
import com.myprojects.inventory.entity.Author;
import com.myprojects.inventory.entity.Book;
import com.myprojects.inventory.repository.AuthorRepository;
import com.myprojects.inventory.repository.BookRepository;
import com.myprojects.inventory.service.InventoryService;
import com.myprojects.inventory.util.TestConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {InventoryServiceImpl.class} )
public class InventoryServiceImplTest {


    @MockBean
    private BookRepository bookRepository;

    @MockBean
    private AuthorRepository authorRepository;

    @Autowired
    private InventoryService inventoryService;


    @Test
    public void getAllBooks_expectCorrectBooksList() {

        when(bookRepository.findAll()).thenReturn(bookList());

        List<BookDTO> bookListResult = inventoryService.getAllBooks();

        BookDTO bookDTO = bookListResult.stream().findFirst().get();

        assertEquals(TestConstants.FIRST_NAME, bookDTO.getAuthor().getFirstName());
        assertEquals(TestConstants.LAST_NAME, bookDTO.getAuthor().getLastName());
        assertEquals(TestConstants.ISBN, bookDTO.getIsbn());
        assertEquals(TestConstants.BOOK_TITLE, bookDTO.getTitle());
        assertEquals(TestConstants.PUBLISHED_DATE, bookDTO.getPublished_date());

    }

    private List<Book> bookList(){
        Book book = new Book();
        Author author = new Author();
        author.setId(Long.valueOf(1));
        author.setFirstName(TestConstants.FIRST_NAME);
        author.setLastName(TestConstants.LAST_NAME);
        book.setAuthor(author);
        book.setId(Long.valueOf(1));
        book.setIsbn(TestConstants.ISBN);
        book.setTitle(TestConstants.BOOK_TITLE);
        LocalDate publishDate = LocalDate.of(2020,06,20);
        book.setPublished_date(publishDate);
        return Arrays.asList(book);
    }
}