package com.startjava.lesson_4.graduation.common;

import java.util.Scanner;

public class BookcaseTest {

    private static Scanner scanner = new Scanner(System.in);
    private static Bookcase bookcase = new Bookcase();
    private static int actionNumber = 0;

    public static void main(String[] args) {
        System.out.println("Выпускной проект StartJava.");

        do {
            displayBookshelf();
            displayMenu();
            actionNumber = choseActions();
            System.out.println();
        } while (actionNumber != Integer.MIN_VALUE);
    }

    private static void displayBookshelf() {
        if (bookcase.getCurrentAmount() == 0) {
            System.out.println("Шкаф пуст.\n");
        } else {
            System.out.println("В шкафу книг - " + bookcase.getCurrentAmount() + 
                    ", свободно полок - " + bookcase.getFreeShelvesAmount() + "\n");
            Book[] books = bookcase.getBooks();
            for (Book book : books) {
                System.out.println("|" + book + "|");
                System.out.println("|-------------------------------------------|\n");
            }
            System.out.println();
        }
    }

    public static void displayMenu() {
        System.out.println("Меню управления книжным шкафом:");
        System.out.println("1. Добавить книгу в шкаф.");
        System.out.println("2. Найти книгу в шкафу.");
        System.out.println("3. Убрать книгу из шкафа.");
        System.out.println("4. Освободить книжный шкаф.");
        System.out.println("5. Выйти из меню управления книжного шкафа.\n");
    }

    private static int choseActions() {
        int counter = 0;
        while (counter <= 0 && counter > Integer.MIN_VALUE) {
            System.out.print("Введите номер команды: ");
            int commandNumber = Integer.parseInt(scanner.nextLine());
            switch (commandNumber) {
                case 1:
                    addBook();
                    counter = 1;
                    break;
                case 2:
                    findBook();
                    counter = 2;
                    break;
                case 3:
                    discardBook();
                    counter = 3;
                    break;
                case 4:
                    freeBookcase();
                    counter = 4;
                    break;
                case 5:
                    counter = Integer.MIN_VALUE;
                    break;
                default:
                    System.out.println("Команды с таким номером не существует. Введите номер " + 
                            "команды от 1 до 5 включительно.");
            }
        }

        return counter;
    }

    private static void addBook() {
        System.out.print("Введите автора книги, которую Вы хотите положить в шкаф: ");
        String author = scanner.nextLine().trim();

        System.out.print("Введите название книги, которую Вы хотите положить в шкаф: ");
        String title = scanner.nextLine().trim();

        System.out.print("Введите год издания книги, которую Вы хотите положить в шкаф: ");
        String publicationYear = scanner.nextLine().trim();

        if (bookcase.addBook(new Book(author, title, publicationYear))) {
            System.out.println("Книга добавлена в шкаф.");
        } else {
            System.out.println("Книга не была добавлена в шкаф, поскольку в нём нет места.");
        }
    }

    private static void findBook() {
        System.out.print("Введите название книги, которую Вы хотите найти в шкафу: ");
        String title = scanner.nextLine().trim();
        if (bookcase.findBook(title)) {
            System.out.println("Книга найдена.");
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static void discardBook() {
        System.out.print("Введите название книги, которую Вы хотите убрать из шкафа: ");
        String title = scanner.nextLine().trim();
        if (bookcase.discardBook(title)) {
            System.out.println("Книга убрана из шкафа.");
        }
    }

    private static void freeBookcase() {
        bookcase.freeBookcase();
        System.out.println("Книжный шкаф освобождён.");
    }
}