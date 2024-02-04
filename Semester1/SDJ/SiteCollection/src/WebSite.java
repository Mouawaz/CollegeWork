public class WebSite {
    private String url;
    private boolean userAccess;

    public WebSite(String url, boolean userAccess){
        this.url=url;
        this.userAccess=userAccess;
    }

    public String getUrl() {
        return url;
    }

    public void setAccess(boolean userAccess) {
        this.userAccess = userAccess;
    }

    public boolean hasAccess() {
        return userAccess;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass()!=getClass())
            return false;
        WebSite other = (WebSite) obj;
        return url.equals(other.url)&&userAccess==other.userAccess;
    }

}
