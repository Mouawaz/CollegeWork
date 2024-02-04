import java.util.ArrayList;

public class BookList {
    ArrayList<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public Book getBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (isbn == books.get(i).getIsbn())
                return books.get(i);
        }
        return null;
    }

    public void removeBook(int index) {
        books.remove(index);
    }

    public int getNumberOfBooksByType(String type) {
        int t = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookType() == type) t++;
        }
        return t;
    }

    public Book[] getBooksByBookType(String bookType) {
        Book[] bookA = null;
        int k = 0;
        for (int i = 0; i < books.size(); i++) {


            if (books.get(i).getBookType() == bookType) {
            bookA[k] = books.get(i);
            k++;
            }
        }
        return bookA;
    }
    public Book[] getAllEBooks(){
        Book[] bookA = null;
        int k = 0;
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getBookType()=="eBook"){
                bookA[k] = books.get(i);
                k++;
            }
        }
        return bookA;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + books +
                '}';
    }
}
