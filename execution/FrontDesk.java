package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int ISSUE_A_BOOK = 1;
    private static final int RETURN_PREVIOUS_BOOK = 2;
    private static final int SHOW_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        long universityRollNumber;
        Student student = new Student();
        Library library = new Library();
        student.setFirstName("Krishnaveer");
        student.setMiddleName("Singh");
        student.setLastName("Chahar");
        String name = student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName();
        do {

            System.out.println("-=-=--=-=-\" Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today");
            System.out.println("1. Issue a new book for me: ");
            System.out.println("2. Return a previously issued book for me:");
            System.out.println("3. Show me all my issued books");
            System.out.println("4. Exit");
            System.out.println("Enter your choice from 1 to 4");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_A_BOOK:
                    System.out.println("Enter your University Roll Number");
                    universityRollNumber = scanner.nextLong();
                    System.out.println("Hello! " + name);
                    System.out.println();
                    System.out.println("Currently Available Books");
                    library.listOfAllAvailableBooks();
                    System.out.println("Enter a book that you want to issue");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    student.issueBook(bookName);
                    System.out.println();
                    break;
                case RETURN_PREVIOUS_BOOK:
                    System.out.println("Enter your University Roll Number");
                    universityRollNumber = scanner.nextLong();
                    System.out.println("Hello! " + name);
                    System.out.println();
                    System.out.println("Return a book that you issued previously");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.previousIssuedBook(bookName);
                    System.out.println();
                    break;
                case SHOW_ISSUED_BOOKS:
                    System.out.println("Enter your University Roll Number");
                    universityRollNumber = scanner.nextLong();
                    System.out.println("Hello! " + name);
                    System.out.println();
                    System.out.println("Issued Books by You");
                    student.allIssuedBooks();
                    break;
                default:
                    System.out.println("Wrong Choice");

            }
        } while (studentInput != EXIT);
        scanner.close();

    }

}
