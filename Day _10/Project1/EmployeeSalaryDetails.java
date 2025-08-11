package Project1;

public class EmployeeSalaryDetails {
    double basicSalary;
    double variableSalary;
    double deductions;
    public EmployeeSalaryDetails(double basicSalary,double variableSalary,double deductions){
        this.basicSalary=basicSalary;
        this.variableSalary=variableSalary;
        this.deductions=deductions;
    }

    public void display() {
        System.out.println("--- Employee Salary Details ---");
        System.out.println("Basic Salary : $" + basicSalary);
        System.out.println("variableSalary          : $" + variableSalary);
        System.out.println("Deductions   : $" + deductions);
    }
}
