public class Employee {
    private String name;
    private int id;
    private double baseSalary;

    double calculatePay() {
        return baseSalary;
    }

    void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + id + "\nTotal Pay: " + calculatePay());
    }
}
