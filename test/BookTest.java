import com.Book;
import com.book.exceptions.BookNotFoundException;
import com.books.database.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BookTest {
    Database database;

    @BeforeEach
    void setUp(){
        database = new Database();
    }
    @Test
    void testThatSystemCanStoreABook(){
        Book java = new Book(1, "java", "dietel", 200.00, 3);
        database.setBookList(java);
        assertNotNull(database.getBookList());
    }
    @Test
    void testThatSystemCanRemoveABook(){
        //Set Book 1
        Book java = new Book(1, "java", "dietel", 200.00, 3);
        database.setBookList(java);
        //Set Book 2
        Book python = new Book(2, "python", "dietel", 300.00, 3);
        database.setBookList(python);

        //check if book is stored
        assertEquals(2, database.getBookList().size());

        //delete a book
        try {
            database.deleteBook(python);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }

        //check if the book is removed
        assertEquals(1, database.getBookList().size());
    }
    @Test
    void testToCheckThatTheBookToBeDeletedIsInTheArrayList(){
        //Set Book 1
        Book java = new Book(1, "java", "dietel", 200.00, 3);
        database.setBookList(java);
        //Set Book 2
        Book python = new Book(2, "python", "dietel", 300.00, 3);
        database.setBookList(python);

        //Set book 3 and not store it in the library
        Book web = new Book(3, "Web", "U.J", 700.00, 4);

        //check if book is stored
        assertEquals(2, database.getBookList().size());

        //delete a book that does not exist in the library
        assertThrows(BookNotFoundException.class, ()-> database.deleteBook(web));
    }
    @Test
    void testThatTheSystemCanSearchForAParticularBookWithBookName() throws BookNotFoundException {
        //Set Book 1
        Book java = new Book(1, "java", "diettel", 200.00, 3);
        database.setBookList(java);
        //Set Book 2
        Book python = new Book(2, "python", "dietel", 300.00, 3);
        database.setBookList(python);

        //To search for a book
        //System.out.println(database.searchFor("dietel"));
        System.out.println(database.getBookList());
       // assertEquals(python, database.searchFor("python"));
    }
}
