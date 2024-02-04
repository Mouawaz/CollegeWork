public class Administrator extends User{

    public Administrator(String name){
        super(name);
    }

    public void setUserAccessForSite(WebSite site){
        for (int i = 0; i < collection.webSites.length; i++) {
            if(collection.getWebSite(i).equals(site))
                collection.getWebSite(i).setAccess(true);
        }
    }
    public Administrator createAdministrator(User user){
        return new Administrator(user.getName());
    }
}
