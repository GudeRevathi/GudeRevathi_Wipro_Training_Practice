package Project1;

public class EmployeeLeaveDetails {
    int earnedLeaves;
    int casualLeaves;
    int sickLeaves;
    int totalLeaves;
    public EmployeeLeaveDetails(int earnedLeaves,int sickLeaves,int casualLeaves,int totalLeaves ){
        this.earnedLeaves=earnedLeaves;
        this.casualLeaves=casualLeaves;
        this.sickLeaves=sickLeaves;
        this.totalLeaves=totalLeaves;
    }


    public void display() {
        System.out.println("--- Employee Leave Details ---");
        System.out.println("Earned Leaves : " + earnedLeaves);
        System.out.println("Casual Leaves : " + casualLeaves);
        System.out.println("Sick Leaves   : " + sickLeaves);
        System.out.println("Total Leaves  : " + totalLeaves);
    }
}
