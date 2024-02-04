public class HourlyEmployee extends Employee{
    private double wagePerHour;
    private double hoursWorkedPerWeek;

    public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek){
        super(name,birthday);
        this.wagePerHour =wagePerHour;
        this.hoursWorkedPerWeek=hoursWorkedPerWeek;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setHoursWorkedPerWeek(double hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public double getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    @Override
    public double earningsPerWeek() {
        return hoursWorkedPerWeek*wagePerHour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wagePerHour=" + wagePerHour +
                ", hoursWorkedPerWeek=" + hoursWorkedPerWeek +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null||obj.getClass()!=getClass())
            return false;
        HourlyEmployee other = (HourlyEmployee) obj;
        return wagePerHour== other.getWagePerHour() && hoursWorkedPerWeek== other.hoursWorkedPerWeek;
    }

}
