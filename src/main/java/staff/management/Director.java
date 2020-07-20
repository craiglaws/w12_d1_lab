package staff.management;

import staff.Employee;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String niNumber, int salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public int payBonus(){
        return getSalary()/50;
//        return super.payBonus()*2;
    }
}
