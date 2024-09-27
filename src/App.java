public class App {
    public static void main(String[] args) {
        Author author = new Author("Дмитрий ", "Глуховский");
        Author author1 = new Author("Анджей ", "Сапковский");
        Book metro = new Book("Метро 2033 ", 2008, author);
        System.out.println("Название книги " + metro.getName());
        System.out.println("Год выпуска " + metro.getYearRelease());
        System.out.println("Автор " + metro.getAuthor().getName() + metro.getAuthor().getLastName());
        System.out.println();
        Book TheWither = new Book("Ведьмак 1", 2022, author1);
        System.out.println("Название книги " + TheWither.getName());
        System.out.println("Год издания " + TheWither.getYearRelease());
        System.out.println("Автор " + TheWither.getAuthor().getName() + TheWither.getAuthor().getLastName());


    }
}
