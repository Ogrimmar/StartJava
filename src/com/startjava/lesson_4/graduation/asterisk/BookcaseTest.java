package com.startjava.lesson_4.graduation.asterisk;

import java.util.Scanner;

public class BookcaseTest {

    private static Scanner scanner = new Scanner(System.in, "cp866");
    private static Bookcase bookcase = new Bookcase();
    private static int actionNumber = 0;

    public static void main(String[] args) {
        System.out.println("Выпускной проект курса StartJava (задание с *).\n");

        displayBookcase();
        do {
            displayMenu();
            actionNumber = choseActions();
            System.out.println("Для продолжения нажмите \"Enter\": ");
            scanner.nextLine();
            displayBookcase();
        } while (actionNumber != Integer.MIN_VALUE);
    }

    private static void displayBookcase() {
        if (!bookcase.hasBooks()) {
            System.out.println("Шкаф пуст.\n");
        } else {
            int countBooks = bookcase.getCount();
            System.out.println("В шкафу книг - " + countBooks + ", свободно полок - " + 
                    bookcase.getFreeShelvesAmount() + "\n");
            Book[] books = bookcase.getBooks();
            for (int i = 0; i < countBooks; i++) {
                System.out.println("|" + books[i] + "|");
                System.out.println("|" + "-".repeat(books[i].getLength()) + "|\n");
            }
            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("""
                           Меню управления книжныи шкафом:
                           1. Добавить книгу в шкаф.
                           2. Найти книгу в шкафу.
                           3. Убрать книгу из шкафа.
                           4. Освободить шкаф.
                           5. Выйти из меню управления шкафа.
                           """);
    }

    private static int choseActions() {
        int counter = 0;
        while (counter < 1 && counter > Integer.MIN_VALUE) {
            System.out.print("Введите номер команды: ");
            int menuItem = Integer.parseInt(scanner.nextLine());
            counter = switch (menuItem) {
                case 1 -> {
                    add();
                    yield 1;
                }
                case 2 -> {
                    find();
                    yield 2;
                }
                case 3 -> {
                    delete();
                    yield 3;
                }
                case 4 -> {
                    free();
                    yield 4;
                }
                case 5 -> {
                    yield Integer.MIN_VALUE;
                }
                default -> {
                    System.out.println("Команды с таким номером не существует.");
                    yield 0;
                }
            };
        }

        return counter;
    }

    private static void add() {
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine().trim();

        String title = enterTitle();

        System.out.print("Введите год издания книги: ");
        String publicationYear = scanner.nextLine().trim();

        if (bookcase.add(new Book(author, title, publicationYear))) {
            System.out.println("Книга добавлена в шкаф.");
        } else {
            System.out.println("Книга не была добавлена в шкаф.");
        }
    }

    private static void find() {
        String title = enterTitle();
        if (bookcase.find(title)) {
            System.out.println("Книга найдена.");
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static void delete() {
        String title = enterTitle();
        bookcase.delete(title);
    }

    private static void free() {
        bookcase.free();
        System.out.println("Книжный шкаф освобождён.");
    }

    private static String enterTitle() {
        System.out.print("Введите название книги: ");
        return scanner.nextLine().trim();
    }
}