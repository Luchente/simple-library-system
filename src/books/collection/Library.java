package books.collection;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс Library представляет библиотеку, которая содержит список книг.
 * Класс содержит методы для добавления книги в библиотеку, вывода всех доступных книг и поиска книг по автору.
 */
public class Library {
    private List<Book> books; // Список книг в библиотеке

    /**
     * Конструктор по умолчанию, который создает пустой список книг.
     */
    public Library() {
        books = new ArrayList<>();
    }

    /**
     * Метод addBook добавляет книгу в библиотеку.
     * @param book Книга, которую нужно добавить в библиотеку
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Метод printAvailableBooks выводит все доступные книги в библиотеке.
     */
    public void printAvailableBooks() {
        boolean hasAvailableBooks = false;
        System.out.println("Доступные книги: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
                hasAvailableBooks = true;
            }
        }
        if (!hasAvailableBooks) {
            System.out.println("Нет книг в наличии");
        }
    }

    /**
     * Метод findBooksByAuthor ищет книги по автору.
     * @param author Автор, по которому нужно найти книги
     * @return Список книг, найденных по автору
     */
    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        if (foundBooks.isEmpty()) {
            System.out.println("Книг автора " + author + " нет в библиотеке");
        }
        return foundBooks;
    }
}