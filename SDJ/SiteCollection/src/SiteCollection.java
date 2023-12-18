public class SiteCollection {
    private int size;
    private static final int MaxSites=25;
    WebSite[] webSites;

    public SiteCollection(){
        this.size = 0;
        webSites = new WebSite[25];
    }

    public int getNumberOfSites() {
        return size;
    }

}
