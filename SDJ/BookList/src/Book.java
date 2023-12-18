public class Book {
    private String title;
    private String isbn;

    public Book(String title,String isbn){
        this.title=title;
        this.isbn=isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookType(){
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
