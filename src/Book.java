public class Book {
    private String name;
    private int yearRelease;

    public Book(String name, int yearRelease) {
        this.name = name;
        this.yearRelease = yearRelease;
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
}
