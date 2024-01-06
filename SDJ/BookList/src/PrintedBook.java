import java.sql.Struct;
import java.util.Objects;

public class PrintedBook extends Book{
    private boolean isPaperback;

    public PrintedBook(String title, String isbn, boolean paperback){
        super(title,isbn);
        this.isPaperback=paperback;
    }
    public boolean isPaperback(){
        return isPaperback;
    }
    public String getBookType(){
        if (isPaperback) return "paperback";
        else return "hardcover";
    }

    @Override
    public String toString() {
        return "PrintedBook{" +
                "isPaperback=" + isPaperback +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PrintedBook that = (PrintedBook) o;
        return isPaperback == that.isPaperback;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPaperback);
    }
}
