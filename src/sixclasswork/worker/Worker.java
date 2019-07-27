package sixclasswork.worker;

public class Worker extends Human {
    private double wage;
    private double hours;

    public double wagePerHour() {
        return wage/hours;
    }

    public Worker(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setNames(String firstName, String lastName) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }

    public void printWorkerInfo() {
        System.out.println(String.format("Name: " + super.getFirstName() + " " + super.getLastName() +
                "\n Wage per hour: " + this.wagePerHour()));
    }

}
