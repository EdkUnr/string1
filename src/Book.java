public class Book {
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
