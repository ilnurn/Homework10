package ru.skypro;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int publicationYear;

    public Book(String bookName, Author authorName, int publicationYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return this.bookName + ", " + this.authorName + ", " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }
}