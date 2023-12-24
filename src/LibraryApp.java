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

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return String.format("Book: %s, Author: %s %s, Year: %d",
                title, author.getFirstName(), author.getLastName(), publicationYear);
    }
}

class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
