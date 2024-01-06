import java.util.Objects;

public class EBook extends Book{
    private String url;

    public EBook(String url, String title, String isbn){
        super(title,isbn);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String getBookType() {
        return "eBook";
    }

    @Override
    public String toString() {
        return super.toString() +" "+ url;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != getClass())
            return false;
        EBook other = (EBook) obj;
        return url.equals(other.url);
    }

}
