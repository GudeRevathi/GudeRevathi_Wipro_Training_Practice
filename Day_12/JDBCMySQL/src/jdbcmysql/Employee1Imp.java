package jdbcmysql;
import java.util.Scanner;
public class Employee1Imp {
	public static void main(String[] args) {
        InsertEmployee1 insertEmp = new InsertEmployee1();
        DeleteEmployee1 deleteEmp = new DeleteEmployee1();
        UpdateEmployee1 updateEmp = new UpdateEmployee1();
        DisplayEmployee1 displayEmp = new DisplayEmployee1();

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n\tEmployee Menu");
            System.out.println("\t--------------");
            System.out.println("\t1. Insert a new Record");
            System.out.println("\t2. Delete a Record");
            System.out.println("\t3. Update the Record");
            System.out.println("\t4. Display all Records");
            System.out.println("\t5. Exit");
            System.out.print("\tEnter your choice (1-5): ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertEmp.insertRecords();
                    break;
                case 2:
                    deleteEmp.deleteRecord();
                    break;
                case 3:
                    updateEmp.updateRecords();
                    break;
                case 4:
                    displayEmp.displayAll();
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1 to 5.");
            }
        }
    }

}
