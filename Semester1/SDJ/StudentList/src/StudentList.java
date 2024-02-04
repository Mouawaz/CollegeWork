public class StudentList {
    private final Student[] students;
    private int size;

    public StudentList(int maxSize) {
        students = new Student[maxSize];
    }

    public void addStudent(Student student) {
        if (students.length > size) {
            students[size] = student;
            size++;
        }
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public int getNumberOfStudents() {
        return size;
    }

    public int getNumberOfStudentsByEducation(Education education) {
        int t = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getEducation() == education)
                t++;
        }
        return t;
    }

    public Student[] getStudentsByEducation(Education education) {
        Student[] temporary = new Student[getNumberOfStudents()];
        int a = 0;
        for (int i = 0; i < getNumberOfStudents(); i++) {
            if (students[i].getEducation() == education) {
                temporary[a] = students[i];
                a++;
            }
        }
        return temporary;
    }

    public int getNumberOfHighSchoolStudents() {
        int a = 0;
        for (int i = 0; i < getNumberOfStudents(); i++) {
            if (students[i].getEducation().getTitle() == "HIGH_SCHOOL") {
                a++;
            }
        }
        return a;
    }
}
