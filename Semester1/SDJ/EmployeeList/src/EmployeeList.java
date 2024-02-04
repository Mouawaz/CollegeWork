import java.util.Arrays;

public class EmployeeList {
    private int size;

    Employee[] employees;
    public EmployeeList(int maxNumberofEmployees){
        size=0;
        employees = new Employee[maxNumberofEmployees];
    }
    public void addEmployee(Employee employee){
        if(size<employees.length){
            employees[size]=employee;
            size++;
        }
    }
    public void removeEmployee(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].equals(employee)){
                for (int j = i; j < employees.length; j++) {
                    employees[j] = employees[j+1];
                }
                break;
            }
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }
    public double getTotalEarningsPerWeek(){
        double a=0;
        for (int i = 0; i < employees.length; i++) {
            a+=employees[i].earningsPerWeek();
        }
        return a;
    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "size=" + size +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != getClass()) return false;
        EmployeeList other = (EmployeeList) obj;
        return size== other.size && employees.equals(other.employees);
    }
}
