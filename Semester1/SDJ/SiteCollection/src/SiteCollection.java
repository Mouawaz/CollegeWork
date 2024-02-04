public class SiteCollection {
    private int size;
    private int MAX_SITES;

    public WebSite[] webSites;

    public SiteCollection(int size,int MAX_SITES){
        this.size=size;
        this.MAX_SITES=MAX_SITES;
        webSites = new WebSite[MAX_SITES];
    }

    public int getNumberOfSites() {
        return size;
    }
    public void addSite(WebSite site){
        if(size<MAX_SITES){
            webSites[size] = site;
            size++;
        }
    }
    public void removeSite(String url){
        for (int i = 0; i < size; i++) {
            if(webSites[i].getUrl()==url){
                for (int j = i; j < size; j++) {
                    webSites[j]=webSites[j+1];
                }
                break;
            }
        }
    }

    public WebSite getWebSite(int index){
        return webSites[index];
    }

    public boolean contains(WebSite site){
        for (int i = 0; i < size; i++) {
            if(webSites[i].equals(site)) return true;
        }
        return false;
    }

}
