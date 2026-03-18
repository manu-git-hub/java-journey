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
}
