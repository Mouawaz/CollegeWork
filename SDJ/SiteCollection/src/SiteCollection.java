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

    public void addSite(WebSite site){
        webSites[size] = site;
        size++;
    }

    public void removeSite(String url){
        int index = -1;
        for (int i = 0; i < size; i++)
        {
            if(webSites[i].getUrl().equals(url)){
                index = i;
            }
        }
        if(index != -1){
            for (int i = index; i < size - 1; i++) {
                webSites[i] = webSites[i + 1];
            }
            webSites[size - 1] = null;
            size--;
        }
    }

    public WebSite getSite(int index) {
        return webSites[index];
    }

    public boolean contains(WebSite site){
        for (int i = 0; i < size; i++) {
            if(webSites[i].equals(site))
                return true;
        }
        return false;
    }
}
