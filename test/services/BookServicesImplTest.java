package services;

import entities.Book;
import exceptions.BookAlreadyExistException;
import exceptions.BookNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServicesImplTest {
    private BookServices bookServices;

    @BeforeEach
    void setUp() {
        bookServices = new BookServicesImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatBookServiceCanAdBook(){
        Book book = new Book("python", "dietel", "1234567");
        try {
            bookServices.addBook(book);
            assertEquals(1, bookServices.getAllBooks().size());
        } catch (BookAlreadyExistException e) {
            e.getLocalizedMessage();
        }
    }
    @Test
    void testThatSystemCanRequestForBooksUsingEitherTheNameOfTheAuthorOrTheTitle(){
        Book book = new Book("python", "dietel", "1234567");
        try {
            bookServices.addBook(book);
            Book foundedBook = bookServices.requestBook("python");
            assertEquals(1, bookServices.getAllBooks().size());
            assertEquals(book, foundedBook);

        } catch (BookAlreadyExistException | BookNotFoundException e) {
            e.getLocalizedMessage();
        }
    }
    @Test
    void testThatSystemCanGetFeedbacksWithBookAndFeedback(){
        Book book = new Book("python", "dietel", "1234567");
        try {
            bookServices.addBook(book);
            Book foundedBook = bookServices.requestBook("python");
            assertEquals(1, bookServices.getAllBooks().size());
            assertEquals(book, foundedBook);
            bookServices.feedBacks(book, "A nice book");
            assertEquals("A nice book", book.getFeedbacks());

        } catch (BookAlreadyExistException | BookNotFoundException e) {
            e.getLocalizedMessage();
        }
    }

}