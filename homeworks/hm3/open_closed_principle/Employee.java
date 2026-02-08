public class Employee {
    private double baseSalary;
    private SalaryStrategy salaryStrategy;

    public Employee(double baseSalary, SalaryStrategy salaryStrategy) {
        this.baseSalary = baseSalary;
        this.salaryStrategy = salaryStrategy;
    }

    public double calculateSalary() {
        return salaryStrategy.calculate(baseSalary);
    }
}
