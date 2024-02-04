import java.util.ArrayList;

public class User {
    private String name;

    public SiteCollection collection;
    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public SiteCollection getSiteCollection() {
        return collection;
    }

    public SiteCollection getAccessibleSites(){
        int a=0;
        SiteCollection temp = new SiteCollection(0,collection.webSites.length);
        for (int i = 0; i < collection.getNumberOfSites(); i++) {
            if(collection.getWebSite(i).hasAccess()) {
                temp.webSites[i] = collection.getWebSite(i);
                a++;
            }
        }
        return temp;
    }
}
