import java.util.Objects;

public class WebSite{
    private String url;
    private boolean userAccess;

    public WebSite(String url,boolean access){
        this.url=url;
        this.userAccess=access;
    }

    public String getUrl() {
        return url;
    }

    public void setAccess(boolean userAccess) {
        this.userAccess = userAccess;
    }
    public boolean hasAccess(){
        return userAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebSite webSite = (WebSite) o;
        return userAccess == webSite.userAccess && Objects.equals(url, webSite.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, userAccess);
    }
}
