package com.startjava.lesson_4.graduation.asterisk;

import java.util.Scanner;

public class BookcaseTest {

    private static Scanner scanner = new Scanner(System.in, "cp866");
    private static Bookcase bookcase = new Bookcase();
    private static int actionNumber = 0;

    public static void main(String[] args) {
        System.out.println("Выпускной проект курса StartJava (задание с *).\n");

        do {
            displayBookcase();
            displayMenu();
            actionNumber = choseActions();
            System.out.println("Для продолжения нажмите \"Enter\": ");
            scanner.nextLine();
        } while (actionNumber != Integer.MIN_VALUE);
    }

    private static void displayBookcase() {
        if (bookcase.hasBooks()) {
            System.out.println("Шкаф пуст.\n");
        } else {
            System.out.println("В шкафу книг - " + bookcase.getCount() + 
                    ", свободно " + "полок - " + bookcase.getFreeShelvesAmount() + "\n");
            Book[] books = bookcase.getBooks();
            for (int i = 0; i < bookcase.getCount(); i++) {
                System.out.println("|" + books[i] + "|");
                System.out.println("|" + "-".repeat(books[i].toString().length()) + "|\n");
            }
            System.out.println();
        }
    }

    public static void displayMenu() {
        System.out.println("Меню управления книжным шкафом:");
        System.out.println("1. Добавить книгу в шкаф.");
        System.out.println("2. Найти книгу в шкафу.");
        System.out.println("3. Убрать книгу из шкафа.");
        System.out.println("4. Освободить шкаф.");
        System.out.println("5. Выйти из меню управления шкафа.\n");
    }

    private static int choseActions() {
        int counter = 0;
        while (counter < 1 || counter > Integer.MIN_VALUE) {
            System.out.print("Введите номер команды: ");
            int commandNumber = Integer.parseInt(scanner.nextLine());
            switch (commandNumber) {
                case 1: 
                    add();
                    counter = 1;
                    break;
                case 2: 
                    find();
                    counter = 2;
                    break;
                case 3: 
                    delete();
                    counter = 3;
                    break;
                case 4: 
                    free();
                    counter = 4;
                    break;
                case 5: 
                    counter = Integer.MIN_VALUE;
                    break;
                default: 
                    System.out.println("Команды с таким номером не существует.");
            }
        }

        return counter;
    }

    private static void add() {
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine().trim();

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine().trim();

        System.out.print("Введите год издания книги: ");
        String publicationYear = scanner.nextLine().trim();

        if (bookcase.add(new Book(author, title, publicationYear))) {
            System.out.println("Книга добавлена в шкаф.");
        } else {
            System.out.println("Книга не была добавлена в шкаф.");
        }
    }

    private static void find() {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine().trim();
        if (bookcase.find(title)) {
            System.out.println("Книга найдена.");
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static void delete() {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine().trim();
        if (bookcase.delete(title)) {
            System.out.println("Книга убрана из шкафа.");
        }
    }

    private static void free() {
        bookcase.free();
        System.out.println("Книжный шкаф освобождён.");
    }
}