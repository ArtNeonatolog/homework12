public class Author {
    private String authorName;
    private String authorLastname;

    public Author (String authorName,String authorLastname) {
        this.authorName = authorName;
        this.authorLastname = authorLastname;
    }
    public String getAuthorName (String artem) {
        return this.authorName;
    }
    public String getAuthorLastname () {
        return this.authorLastname;
    }
}