/*  Created by IntelliJ IDEA.
 *  User: Krishnaveer Chahar (191500410)
 *  File Name : Book.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private Book[] allNamesOfIssuedBooks;
    private String firstName;
    private String lastName;
    private String middleName;
    private long universityRollNumber;
    private int numberOfBooksIssued;

    public Student() {
        this.allNamesOfIssuedBooks = new Book[2];
        for (int i = 0; i < allNamesOfIssuedBooks.length(); i++) {
            allNamesOfIssuedBooks[0] = new Book();
            allNamesOfIssuedBooks[1] = new Book("Machine Learning");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Student(Book[] allNamesOfBooksIssued) {
        this.allNamesOfIssuedBooks = allNamesOfBooksIssued;
    }

    public Book[] getAllNamesOfBooksIssued() {
        return allNamesOfIssuedBooks.clone();
    }

    public void setAllNamesOfBooksIssued(Book[] allNamesOfBooksIssued) {
        this.allNamesOfIssuedBooks = allNamesOfBooksIssued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(getAllNamesOfBooksIssued(), student.getAllNamesOfBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getAllNamesOfBooksIssued());
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(allNamesOfIssuedBooks);
    }

    public void issueBook(String bookName) {
        System.out.println(bookName + " is issued for you");
    }

    public void previousIssuedBook(String bookName) {
        System.out.println(bookName + "previously issued book" + ".");
    }

    public void allIssuedBooks() {
        for (Book issuebooks : allNamesOfIssuedBooks) {
            System.out.println(issuebooks);
        }
    }


}
