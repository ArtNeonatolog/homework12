public class Book {
   private String nameOfTheBook;
   int year;
   private final Author author;

    public Book (String nameOfTheBook, int year, Author author) {
        this.nameOfTheBook = nameOfTheBook;
        this.year = year;
        this.author = author;
    }
    public String getNameOfTheBook() {
        return this.nameOfTheBook;
    }
    public int getYear() {
        return this.year;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setYear(int year) {
    this.year = year;
    }
    public String bookInfo () {
        return "Книга " + this.nameOfTheBook + "; Автор: " + this.author.getFullName() + "; Год издания - " + this.year + ".";
    }
}
