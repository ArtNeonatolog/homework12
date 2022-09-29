public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", 1949);
        Author authorBook1 = new Author("George", "Orwell");
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.year = " + book1.getYear());
        book1.setYear(1960); //изменение года несмотря на private
        System.out.println("book2.getYear() = " + book1.getYear());
        System.out.println("authorBook1.authorName = " + authorBook1.getAuthorName());
        System.out.println("authorBook1.authorLastname = " + authorBook1.getAuthorLastname());
        System.out.println();

        Book book2 = new Book ("The Lord of the Rings", 1954);
        Author authorBook2 = new Author("John", "Ronald Reuel Tolkien");
        System.out.println("book2.name = " + book2.getName());
        System.out.println("book2.year = " + book2.getYear());
        book2.setYear(1978);
        System.out.println("book2.getYear() = " + book2.getYear());
        System.out.println("authorBook2.authorName = " + authorBook2.getAuthorName());
        System.out.println("authorBook2.authorLastname = " + authorBook2.getAuthorLastname());
    }
}
