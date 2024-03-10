public class Book {
    private String title;
    private Author author;
    private int yearPublication;

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "название книги:" + this.title + ",автор:" + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title == book.title;
    }

    @Override
    public int hashCode() {
        int result = title == null ? 0 : title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + yearPublication;
        return result;
    }
    //public boolean equals(Book other) {
    //    if (this.getYearPublication() other.getT{
    //        return false;
    //    }
    //    Object other;
    //    book c2 = (book) book;
    //    return book.equals(book);
}







