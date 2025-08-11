package Project1;

public class EmployeeProjectDetails {
    String projectName ;
    String projectDuration ;
    String projectTeamlead;
    int TeamSize ;
    String role;
    public EmployeeProjectDetails(String projectName, String projectDuration, String projectTeamlead,int TeamSize,String role )
    {
        this.projectName=projectName;
        this.projectDuration=projectDuration;
        this.projectTeamlead=projectTeamlead;
        this.TeamSize=TeamSize;
        this.role=role;
    }

    public void display() {
        System.out.println("--- Employee Project Details ---");
        System.out.println("projectName : " + projectName);
        System.out.println("projectDuration : " + projectDuration);
        System.out.println("Project Teamlead : " + projectTeamlead);
        System.out.println("TeamSize: " + TeamSize);
        System.out.println("Role: "+role);
    }
}
