//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book metro = new Book("Метро 2033 ", 2008);
        System.out.println("Название книги " + metro.getName());
        System.out.println("Год выпуска " + metro.getYearRelease());
        Author metroOne = new Author("Дмитрий ", "Глуховский");
        System.out.println("Автор " + metroOne.getName() + metroOne.getLastName());
        System.out.println();
        Book TheWither = new Book("Ведьмак 1", 2022);
        System.out.println("Название книги " + TheWither.getName());
        System.out.println("Год издания " + TheWither.getYearRelease());
        Author TheWitherone = new Author("Анджей ", "Сапковский");
        System.out.println("Автор " + TheWitherone.getName() + TheWitherone.getLastName());


    }
}