package staff.management;

public class Director extends Manager {

    private int budget;

    public Director(String name, String NInumber, double salary, String deptName, int budget) {
        super(name, NInumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
