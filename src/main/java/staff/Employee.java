package staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, int salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public void setNInumber(String NInumber) {
        this.NInumber = NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(double raise) {
        return this.salary += raise;
    }

    public double payBonus() {
        return this.salary / 100;
    }

}
