package com.startjava.lesson_4.graduation.common;


import java.util.Scanner;

public class BookshelfTest {

    private static final int ATTEMPTS = Integer.MAX_VALUE;
    private static final Scanner scanner = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();
    private static int actionNumber = 0;

    public static void main(String[] args) {
        System.out.println("Выпускной проект StartJava.");
        
        displayBookshelf();
        do {
            displayMenu();
            
            actionNumber = choseActions();
            displayBookshelf();
            
            System.out.print("Для продолжения нажмите Enter: ");
            scanner.nextLine();
            System.out.println();
        } while (actionNumber != ATTEMPTS);
    }

    private static void displayBookshelf() {
        if (bookshelf.getAmountOfBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу." + "\n");
        } else {
            System.out.println("В шкафу книг - " + bookshelf.getAmountOfBooks() + ", свободно полок - " + 
                    bookshelf.getFreeShelves() + "\n");

            Book[] books = bookshelf.getAllBooks();
            for (Book book : books) {
                System.out.println("|" + book + "|");
                System.out.println("|" + "-------------------------------------------" + "|");
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void displayMenu() {
        System.out.println("""
                1. Добавить книгу в шкаф.
                2. Найти книгу в шкафу.
                3. Убрать книгу из шкафа.
                4. Освободить книжный шкаф.
                5. Выйти из меню управления книжного шкафа.
        """);
    }

    private static int choseActions() {
        System.out.print("Введите номер команды: ");
        int commandNumber = Integer.parseInt(scanner.nextLine());

        switch (commandNumber) {
            case 1: 
                addBook();
                break;
            case 2: 
                findBook();
                break;
            case 3: 
                discardBook();
                break;
            case 4: 
                freeBookshelf();
                break;
            case 5: 
                { return ATTEMPTS; }
            default: 
                System.out.println("Команды с таким номером не существует. Введите номер с командой от 1 до 4 включительно.");
                choseActions();
        }

        return 0;
    }

    private static void addBook() {      
        System.out.print("Введите автора книги, которую Вы хотите положить в книжный шкаф: ");
        String author = scanner.nextLine();
        
        System.out.print("Введите название книги, которую Вы хотите положить в книжный шкаф: ");
        String title = scanner.nextLine();
        
        System.out.print("Введите год издания книги, которую Вы хотите положить в книжный шкаф: ");
        int publicationYear = Integer.parseInt(scanner.nextLine());

        boolean flag = bookshelf.addBook(new Book(author, title, publicationYear));
        if (flag) {
            System.out.println("Книга добавлена в шкаф.\n");
        } else {
            System.out.println("Книга не была добавлена в шкаф, поскольку в нём нет места.\n");
        }
    }

    private static void findBook() {
        System.out.print("Введите название книги, которую Вы хотите найти в книжном шкафу: ");
        String title = scanner.nextLine();

        Book book = bookshelf.findBook(title);
        if (book == null) {
            System.out.println("Книга не найдена.\n");
        } else {
            System.out.println("Книга найдена.\n");
        }
    }

    private static void discardBook() {
        System.out.print("Введите название книги, которую Вы хотите убрать из книжного шкафа: ");
        String title = scanner.nextLine();

        boolean flag = bookshelf.discardBook(title);
        if (flag) {
            System.out.println("Книга убрана из шкафа.\n");
        }
    }

    private static void freeBookshelf() {
        bookshelf.freeBookshelf();

        System.out.println("Книжный шкаф освобождён.\n");
    }
}