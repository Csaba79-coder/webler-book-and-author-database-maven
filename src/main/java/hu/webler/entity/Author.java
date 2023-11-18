package hu.webler.entity;

import hu.webler.base.Identifier;

import java.util.List;

public class Author extends Identifier {

    private String name;
    private List<Book> books;

    public Author() {
        super();
    }

    public Author(String name, List<Book> books) {
        super();
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
