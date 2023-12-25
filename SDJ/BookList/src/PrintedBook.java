import java.sql.Struct;

public class PrintedBook extends Book{
    private boolean isPaperback;

    public PrintedBook(String title, String isbn, boolean paperback){
        super(title,isbn);
        this.isPaperback=paperback;
    }
    
}
