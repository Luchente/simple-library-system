import books.collection.Book;
import books.collection.Library;

/**
 * Класс Main является точкой входа в приложение библиотеки.
 * В статическом блоке инициализации создается объект библиотеки и добавляются несколько книг.
 * В методе main выводится список доступных книг, а затем одна из книг автора "Autor1" берется на прочтение.
 */
public class Main {

    static Library library = new Library();

    static {
        System.out.println("Запуск программы библиотеки...");
        library.addBook(new Book("Book1", "Autor1", 1983, true));
        library.addBook(new Book("Book2", "Autor2", 1997, true));
        library.addBook(new Book("Book3", "Autor1"));
        library.addBook(new Book("Book4", "Autor4"));
    }

    public static void main(String[] args) {

        library.printAvailableBooks();

        Book book1 = library.findBooksByAuthor("Autor1").get(0);
        book1.borrowBook();

        System.out.println("\n Книги автора Autor1:");
        for (Book book : library.findBooksByAuthor("Autor1")) {
            book.displayInfo();
        }

        System.out.println("\n--- Доступные книги после взятия книги ---");
        library.printAvailableBooks();

        book1.returnBook();

        System.out.println("\n--- Доступные книги после возврата книги ---");
        library.printAvailableBooks();

        System.out.println("\n Книги автора Author1:");
        for (Book book : library.findBooksByAuthor("Autor1")) {
            book.displayInfo();
        }

    }
}