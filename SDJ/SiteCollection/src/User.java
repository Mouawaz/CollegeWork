public class User {
    String name;
    SiteCollection collection = new SiteCollection();

    public User(String name){
       this.name=name;
    }

    public String getName() {
        return name;
    }

    public SiteCollection getSiteCollection(){
        return collection;
    }

    public SiteCollection getAccessibleSites(){
        for (int i = 0; i < collection.webSites.length; i++) {
            if(collection.webSites[i].hasAccess())
                System.out.println(collection.webSites[i].toString());
            }
        return null;
        }
    }

