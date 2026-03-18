class Main {
    public static void main(String[] ar) {
        Employee emp1 = new FullTimeEmployee("John", 1, 5000, 1000);
        Employee emp2 = new PartTimeEmployee("Jane", 2, 20, 10);

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println();
        }
    }
}
