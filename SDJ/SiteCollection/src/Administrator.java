public class Administrator extends User{

    public Administrator(String name){
        super(name);
    }
    public void setUserAccess(WebSite site) {
        for (int i = 0; i < collection.webSites.length; i++) {
            if (collection.getSite(i).equals(site))
                collection.getSite(i).setAccess(true);
        }
    }
    //public Administrator createAdmin(User user){

   // }
}
