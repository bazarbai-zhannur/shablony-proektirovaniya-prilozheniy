public class PermanentSalary implements SalaryStrategy {
    public double calculate(double baseSalary) {
        return baseSalary * 1.2;
    }
}
