package books.collection;

/**
 * Класс Book представляет книгу с полями title, author, year и isAvailable.
 * Класс содержит конструкторы, методы borrowBook, returnBook, displayInfo, а также геттеры для title, author, year и isAvailable.
 */
public class Book {
    public static final int UNKNOWN_YEAR = -1; // Неизвестный год

    private String title; // Название книги
    private String author; // Автор книги
    private int year; // Год издания книги
    private boolean isAvailable; // Доступна ли книга для выдачи

    /**
     * Конструктор, принимающий все поля.
     * @param title Название книги
     * @param author Автор книги
     * @param year Год издания книги
     * @param isAvailable Доступна ли книга для выдачи
     */
    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    /**
     * Конструктор, который задает только название книги и автора.
     * Остальные поля заполняются значениями по умолчанию.
     * @param title Название книги
     * @param author Автор книги
     */
    public Book(String title, String author) {
        this(title, author, UNKNOWN_YEAR, true);
    }

    /**
     * Метод borrowBook устанавливает isAvailable в false, если книга доступна.
     */
    public void borrowBook() {
        if (!isAvailable) {
            System.out.println("Книга [" + title + "] уже взята.");
            return;
        }
        isAvailable = false;
        System.out.println("Вы взяли книгу: " + title);
    }

    /**
     * Метод returnBook устанавливает isAvailable в true, если книга была взята.
     */
    public void returnBook() {
        if (isAvailable) {
            System.out.println("Книга [" + title + "] уже в библиотеке.");
            return;
        }
        isAvailable = true;
        System.out.println("Вы вернули книгу: " + title);
    }

    /**
     * Метод displayInfo выводит информацию о книге.
     */
    public void displayInfo() {
        String yearInfo = (year != UNKNOWN_YEAR) ? String.valueOf(year) : "Год издания неизвестен"; // Проверка через константу
        System.out.printf("Название: %s, Автор: %s, Год издания: %s, Наличие: %s%n",
                title, author, yearInfo, (isAvailable ? "Да" : "Нет"));
    }

    /**
     * Геттер для title.
     * @return Название книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Геттер для author.
     * @return Автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Геттер для year.
     * @return Год издания книги
     */
    public int getYear() {
        return year;
    }

    /**
     * Геттер для isAvailable.
     * @return Доступна ли книга для выдачи
     */
    public boolean isAvailable() {
        return isAvailable;
    }
}
