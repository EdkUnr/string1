public class LibraryApp {
    public static void main(String[] args) {
        Author tolkien = new Author("J.R.R.", "Tolkien");
        Author rowling = new Author("J.K.", "Rowling");

        Book lotr = new Book("The Lord of the Rings", tolkien, 1954);
        Book hp = new Book("Harry Potter", rowling, 1997);

        System.out.println(lotr);
        System.out.println(hp);

        hp.setPublicationYear(1998);
        System.out.println("Updated year for Harry Potter: " + hp.getPublicationYear());
    }
}


