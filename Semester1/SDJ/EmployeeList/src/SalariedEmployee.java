public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String name, Date birthday, double weeklySalary){
        super(name, birthday);
        this.weeklySalary=weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earningsPerWeek() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass()!=getClass()) return false;
        SalariedEmployee other = (SalariedEmployee) obj;
        return weeklySalary==other.weeklySalary;
    }
}
