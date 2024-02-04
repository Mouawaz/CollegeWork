public class School extends Education{
    private String type;

    public static String INFANT_SCHOOL = "Infant school";
    public static String JUNIOR_SCHOOL = "Junior school";
    public static String SECONDARY_SCHOOL = "Secondary school";
    public static String HIGH_SCHOOL = "High school";

    public School(String code, String title, String type){
        super(code, title);
        this.type=type;
    }

    public String getSchoolType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass()!= getClass())
            return false;
        School other = (School) obj;
        return type.equals(other.type);
    }

    @Override
    public String toString() {
        return "School{" +
                "type='" + type + '\'' +
                '}';
    }
}
