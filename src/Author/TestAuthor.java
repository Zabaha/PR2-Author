package Author;

public class  TestAuthor{

    public static void main(String[] args) {
        Author author1 = new Author("Genady Potapov", "Potap@mail.ru", 'M');
        Author author2 = new Author("Anastasy Jukova", "Nasty@gmail.com", 'F');
        System.out.println(author1.toStr());
        System.out.println(author2.toStr());
    }
}
