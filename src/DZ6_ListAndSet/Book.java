package DZ6_ListAndSet;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;
    private Long isbn;

    private String authorName;
    private String authorSurname;
    private String authorLastname;

    public Book() {
        name = "";
        isbn = 0L;
        authorName = "";
        authorSurname = "";
        authorLastname = "";
    }

    public Book(String name, Long isbn, String authorName, String authorSurname, String authorLastname) {
        this.name = name;
        this.isbn = isbn;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorLastname = authorLastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getName().equals(book.getName()) &&
                getIsbn().equals(book.getIsbn()) &&
                getAuthorSurname().equals(book.getAuthorSurname()) &&
                getAuthorName().equals(book.getAuthorName()) &&
                getAuthorLastname().equals(book.getAuthorLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getIsbn(), getAuthorName(), getAuthorSurname(), getAuthorLastname());
    }

    @Override
    public String toString() {
        return
                "Author: " + authorSurname + ' ' +
                        authorName + ' ' +
                        authorLastname +
                        "\tBook name: " + name +
                        "\tISBN: " + isbn;
    }

    @Override
    public int compareTo(Book o) {
        if (this.authorSurname.compareTo(o.authorSurname) < 0) return -1;
        if (this.authorSurname.compareTo(o.authorSurname) > 0) return 1;
        if (this.authorName.compareTo(o.authorName) < 0) return -1;
        if (this.authorName.compareTo(o.authorName) > 0) return 1;
        if (this.authorLastname.compareTo(o.authorLastname) < 0) return -1;
        if (this.authorLastname.compareTo(o.authorLastname) > 0) return 1;
        return 0;
    }
}
