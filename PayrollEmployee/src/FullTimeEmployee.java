public class FullTimeEmployee extends Employee {

    public double bonus;

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return calculatePay() + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus);
    }

    public void displayInfo(boolean showBonus) {
        super.displayInfo();
        if (showBonus) {
            System.out.println("Bonus: " + bonus);
        }
    }
}
