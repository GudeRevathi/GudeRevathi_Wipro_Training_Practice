package Project1;
import java.util.Scanner;
public class EmpMenuSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        EmployeePersonalDetails personalDetails=new EmployeePersonalDetails("Revathi",30,"Femail","Vemavaram","Single");
        EmployeeProfessionalDetails professionalDetails=new EmployeeProfessionalDetails("revathi@gmail","IT","Software Engineer","1-Jan-2025");
        EmployeeSalaryDetails salaryDetails=new EmployeeSalaryDetails(40000.00,10000.00,3000.00);
        EmployeeLeaveDetails leaveDetails=new EmployeeLeaveDetails(12,8,5,25);
        EmployeeProjectDetails projectDetails=new EmployeeProjectDetails("Human Perception Estimator","3 Months","Gude",6,"Developer");
        do {
            System.out.println("Employee Menu");
            System.out.println("-------------");
            System.out.println("1. Display Employee Personal Details");
            System.out.println("2. Display Employee Professional Details");
            System.out.println("3. Display Employee Salary Details");
            System.out.println("4. Display Employee Earned Leaves and Casual Leaves");
            System.out.println("5. Display Employee Projects Undertaken");
            System.out.println("6. Exit the Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    personalDetails.display();
                    break;
                case 2:
                    professionalDetails.display();
                    break;
                case 3:
                    salaryDetails.display();
                    break;
                case 4:

                    leaveDetails.display();
                    break;
                case 5:
                    projectDetails.display();
                    break;
                case 6:
                    System.out.println("Exiting menu!...........");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
