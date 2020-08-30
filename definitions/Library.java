/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] currentlyAvailableBooks;

    public Library() {
        currentlyAvailableBooks = new Book[4];
        for (int i = 0; i < currentlyAvailableBooks.length; i++) {
            currentlyAvailableBooks[0] = new Book("Deep ");
            currentlyAvailableBooks[1] = new Book();
            currentlyAvailableBooks[2] = new Book("se", "dss", "223");
            currentlyAvailableBooks[3] = new Book("fnn", "fr");
        }
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks;
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    @Override
    public String toString() {
        return Arrays.toString(currentlyAvailableBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyAvailableBooks());
    }

    public void listOfAllAvailableBooks() {
        for (Book library : currentlyAvailableBooks) {
            System.out.println(library);
        }
    }
}

