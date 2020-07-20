package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(Double increment){
        if(increment > 0) {
            int raiseAmount = (int) ((salary * increment) / 100);
            salary += raiseAmount;
        }
    }

    public int payBonus(){
        return salary/100;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
