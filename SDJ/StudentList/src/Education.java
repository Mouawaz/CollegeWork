public class Education {
    private String code;
    private String title;

    public Education(String code,String title){
        this.code=code;
        this.title=title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || obj.getClass()!=getClass())
            return false;
        Education other = (Education) obj;
        return title.equals(other.title)&&code.equals(other.code);
    }

    @Override
    public String toString() {
        return "Code: "+ code +" "+" Title: " +title;
    }

}
