public class ContractSalary implements SalaryStrategy {
    public double calculate(double baseSalary) {
        return baseSalary * 1.1;
    }
}
