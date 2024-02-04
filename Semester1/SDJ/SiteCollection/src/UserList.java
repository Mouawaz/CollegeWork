import java.util.ArrayList;

public class UserList {

    ArrayList<User> users;
    public UserList(){
        users = new ArrayList<>();
    }

    public int getNumberOfUsers(){
        return  users.size();
    }
    public void addUser(User user){
        users.add(user);
    }
    public User getUser(int index){
        return users.get(index);
    }
    public User findAUserWithAccessTo(WebSite site){
        for (int i = 0; i < users.size(); i++) {
            for (int j = 0; j < users.get(i).collection.getNumberOfSites(); j++) {
                if(users.get(i).collection.getWebSite(j).equals(site))
                    return users.get(i);
            }
        }
        return null;
    }

    public Administrator findFirstAdministrator(){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i) instanceof Administrator)
                return (Administrator) users.get(i);
        }
        return null;
    }

}
