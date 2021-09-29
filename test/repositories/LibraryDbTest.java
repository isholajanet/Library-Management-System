package repositories;

import entities.Book;
import exceptions.BookNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryDbTest {
    private LibraryDb bookDatabase;

    @BeforeEach
    void setUp() {
        bookDatabase = new LibraryDb();

    }

    @AfterEach
    void tearDown() {
        bookDatabase = null;
    }

    @Test
    void testThatSystemCanAddABook(){
        Book book = new Book("java", "dietel", "12345678");
        bookDatabase.add(book);
        assertEquals(1, bookDatabase.getBookDatabase().size());
    }
    @Test
    void testThatSystemCanDeleteBook(){
        Book book = new Book("java", "dietel", "12345678");
        Book python = new Book("python", "diettel", "23456789");
        bookDatabase.add(book);
        bookDatabase.add(python);
        assertEquals(2, bookDatabase.getBookDatabase().size());

        bookDatabase.delete(book);
        assertEquals(1, bookDatabase.getBookDatabase().size());
    }
    @Test
    void testThatSystemCanSearchThroughTheDatabase(){
        Book book = new Book("java", "dietel", "12345678");
        Book python = new Book("python", "diettel", "23456789");
        bookDatabase.add(book);
        bookDatabase.add(python);

        Book foundedBook = null;
        try {
            foundedBook = bookDatabase.search("java");
            assertEquals(book, foundedBook);
            Book foundedBook1 = bookDatabase.search("diettel");
            assertEquals(python, foundedBook1);
        } catch (BookNotFoundException e) {
            e.getLocalizedMessage();
        }
    }
}