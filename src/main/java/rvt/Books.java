package rvt;

import java.util.*;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String command = scanner.nextLine();

        for (Book book : books) {
            if (command.equals("everything")) {
                System.out.println(book);
            } else if (command.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}

class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}