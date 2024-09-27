public class Book {
    private String name;
    private int yearRelease;
    private Author author;

    public Book(String name, int yearRelease, Author author) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getYearRelease() {
        return this.yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
    public Author getAuthor() {
        return this.author;
    }
}
