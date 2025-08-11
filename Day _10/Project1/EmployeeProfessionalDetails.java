package Project1;

public class EmployeeProfessionalDetails {
    String empId;
    String department;
    String designation;
    String doj;
    public EmployeeProfessionalDetails(String empId,String department,String designation ,String doj){
        this.empId=empId;
        this.department=department;
        this.designation=designation;
        this.doj=doj;
    }

    public void display() {
        System.out.println("--- Employee Professional Details ---");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Department    : " + department);
        System.out.println("Designation   : " + designation);
        System.out.println("Date of Join  : " + doj);
    }
}
