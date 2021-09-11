package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static int option;
    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Book> books = new ArrayList<Book>();
    public static ArrayList<Magazine> magazines = new ArrayList<Magazine>();

    public Menu() {
        mainMenu();
    }

    public static void mainMenu() {
        do {
            System.out.println("\nMENU");
            System.out.println("1. Register book");
            System.out.println("2. Register magazine");
            System.out.println("3. Lend");
            System.out.println("4. Give back");
            System.out.println("5. Show catalogue");
            System.out.println("6. Get out");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    registerBook();
                    break;
                case 2:
                    registerMagazine();
                    break;
                case 3:
                    lend();
                    break;
                case 4:
                    giveBack();
                    break;
                case 5:
                    showCatalogue();
                    break;
                default:
                    System.out.println("\nSee you!\n");
                    return;
            }
        } while (option>= 1 && option <= 5);
    }

    public static Book findBookByCode(String code) {
        
        for (Book book : books) {
            if (book.getCode() == code) {
                return book;
            }
        }

        return null;

    }

    public static Magazine findMagazineByCode(String code) {
        
        for (Magazine magazine : magazines) {
            if (magazine.getCode() == code) {
                return magazine;
            }
        }

        return null;

    }

    public static void printBooks() {

        for (Book book : books) {
            System.out.println(book);
        }

    }

    public static void printMagazines() {
        
        for (Magazine magazine : magazines) {
            System.out.println(magazine);
        }

    }

    public static void registerBook() {
        
        String code;
        String title;
        int year;
        
        System.out.println("\nREGISTER BOOK");
        
        System.out.print("Enter code: ");
        code = scanner.nextLine();
        
        if (findBookByCode(code) != null) {
            System.out.println("\nA book with the code " + "'" + code + "'" + " is already registered");
            return;
        }

        System.out.print("Enter title: ");
        title = scanner.nextLine();
        
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        
        books.add(new Book(code, title, year));

        System.out.println("\nThe book has been registered :)");

    }

    public static void registerMagazine() {
        
        String code;
        String title;
        int year;
        int number;
        
        System.out.println("\nREGISTER MAGAZINE");
        
        System.out.print("Enter code: ");
        code = scanner.nextLine();
        
        if (findMagazineByCode(code) != null) {
            System.out.println("\nA magazine with the code " + "'" + code + "'" + " is already registered");
            return;
        }

        System.out.print("Enter title: ");
        title = scanner.nextLine();
        
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        
        System.out.print("Enter number: ");
        number = scanner.nextInt();
        
        magazines.add(new Magazine(code, title, year, number));
        
        System.out.println("\nThe magazine has been registered :)");

    }

    public static void lend() {

        String code;
        Book book;

        System.out.println("\nLEND BOOK");

        System.out.print("Enter code: ");
        code = scanner.nextLine();

        book = findBookByCode(code); 

        if(book != null) {

            if (book.isBorrowed()) {
                System.out.println("\nSorry, the book is already borrowed :(");
                return;
            }
            
            book.lend();
            System.out.println("\nThe book has been borrowed :)");
        
        } else {
            System.out.println("\nThe book is not registered :(");
        }

    }

    public static void giveBack() {

        String code;
        Book book;

        System.out.println("\nGIVE BOOK BACK");

        System.out.print("Enter code: ");
        code = scanner.nextLine();

        book = findBookByCode(code); 

        if(book != null) {

            if (!book.isBorrowed()) {
                System.out.println("\nThis book is not borrowed");
                return;
            }
            
            book.giveBack();
            System.out.println("\nThe book has been given back :)");
        
        } else {
            System.out.println("\nThe book is not registered :(");
        }

    }

    public static void showCatalogue() {

        System.out.println("\nCATALOGUE");

        System.out.println("\nBooks");
        printBooks();

        System.out.println("\nMagazines");
        printBooks();

    }

}
