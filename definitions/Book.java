/*  Created by IntelliJ IDEA.
 *  User: Krishnaveer Chahar (191500410)
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {

    private String bookName;
    private String authorName;
    private String bookISBNNumber;

    public Book(String bookName) {
        this.bookName = "Java";
        this.authorName = "Herbert Schildt";
        this.bookISBNNumber = "97-812-5958-922-1";
    }

    public Book() {
        this.bookName = "Machine Learning";
        this.authorName = "Andrew NG";
        this.bookISBNNumber = "9781617290183";
    }

    public Book(String bookName, String authorName, String bookISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = "12-35-312-564";
    }

    public String getBookName() {
        return authorName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "bookName : " + bookName + '\'' +
                        ", authorName : " + authorName + '\'' +
                        ", bookISBNNumber : " + bookISBNNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getBookISBNNumber(), book.getBookISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getBookISBNNumber());
    }
}


