package hu.webler;

import hu.webler.entity.Author;
import hu.webler.entity.Book;
import hu.webler.repository.DatabaseRepository;
import hu.webler.service.AuthorService;
import hu.webler.service.BookService;

import java.sql.Connection;
import java.sql.SQLException;

public class BookAndAuthorApp {

    public static void main(String[] args) {

        try (Connection connection = DatabaseRepository.getConnection()) {
            AuthorService authorService = new AuthorService();
            Author author = new Author();
            author.setName("John Doe");
            author = authorService.save(author, connection);
            System.out.println(author);

            BookService bookService = new BookService();
            Book book = new Book();
            book.setTitle("Test Book");
            book.setAuthor(author);

            Book saved = new Book();
            saved.setTitle("Test Book 2.");
            saved.setAuthor(author);

            book = bookService.save(book, connection);
            saved = bookService.save(saved, connection);
            System.out.println(book);
            System.out.println(saved);
            System.out.println(author);
        } catch (SQLException e) {
            // Handle exceptions, log errors, and consider rolling back the transaction
            e.printStackTrace(); // You should log the exception details instead of printing stack trace directly
        }
    }
}
