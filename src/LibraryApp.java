public class LibraryApp {
    public static void main(String[] args) {
        // Создание объектов "Автор"
        Author tolkien = new Author("J.R.R.", "Tolkien");
        Author rowling = new Author("J.K.", "Rowling");

        // Создание объектов "Книга"
        Book lotr = new Book("The Lord of the Rings", tolkien, 1954);
        Book hp = new Book("Harry Potter and the Philosopher's Stone", rowling, 1997);

        // Вывод информации о книгах
        System.out.println("Book: " + lotr.getTitle() + ", Author: " + lotr.getAuthor().getFirstName() + " " + lotr.getAuthor().getLastName() + ", Year: " + lotr.getPublicationYear());
        System.out.println("Book: " + hp.getTitle() + ", Author: " + hp.getAuthor().getFirstName() + " " + hp.getAuthor().getLastName() + ", Year: " + hp.getPublicationYear());

        // Изменение года публикации книги
        hp.setPublicationYear(1998);
        System.out.println("Updated year for Harry Potter: " + hp.getPublicationYear());
    }
}



