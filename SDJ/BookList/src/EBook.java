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
        return 
    }
}
