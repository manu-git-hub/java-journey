public class Employee {


    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    double calculatePay() {
        return baseSalary;
    }

    void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + id + "\nTotal Pay: " + calculatePay());
    }
}
