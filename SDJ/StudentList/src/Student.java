public class Student {
    private Education education;
    private String name;

    public Student(String name, Education education){
        this.name= name;
        this.education=education;
    }

    public String getName() {
        return name;
    }

    public Education getEducation() {
        return education;
    }

    public void changeEducation(Education education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass()!= getClass())
            return false;
        Student other = (Student) obj;
        return name.equals(other.name)&& education.equals(other.education);
    }

    @Override
    public String toString() {
        return "Student{" +
                "education=" + education +
                ", name='" + name + '\'' +
                '}';
    }
}
