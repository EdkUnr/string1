public class LibraryApp {
    public static void main(String[] args) {
        // Создание объектов авторов
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");

        // Создание объектов книг
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        // Вывод информации о книгах
        System.out.println(book1);
        System.out.println(book2);

        // Изменение года публикации книги
        book1.setPublicationYear(1870);
        System.out.println("Измененный год публикации книги 'Война и мир': " + book1.getPublicationYear());
    }
}




