public class Main {
    public static void main(String[] args) {
        Author authorOfTheBook1 = new Author("George", "Orwell");
        Book book1 = new Book("1984", 1949, authorOfTheBook1);
        System.out.println(book1.bookInfo());
        book1.setYear(1960);
        System.out.println(book1.bookInfo());
        System.out.println();

        Author authorOfTheBook2 = new Author("John", "John Ronald Reuel Tolkien");
        Book book2 = new Book ("The Lord of the Rings", 1954, authorOfTheBook2);
        System.out.println(book2.bookInfo());
        book2.setYear(1980);
        System.out.println(book2.bookInfo());
    }
}
