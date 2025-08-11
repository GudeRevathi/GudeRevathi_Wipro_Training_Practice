package Project1;

public class EmployeePersonalDetails {
    String name;
    int age;
    String gender;
    String address;
    String maritalStatus;
    public EmployeePersonalDetails(String name,int age,String gender,String address,String maritalstatus){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.address=address;
        this.maritalStatus=maritalstatus;

    }

    public void display() {
        System.out.println("--- Employee Personal Details ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Gender  : " + gender);
        System.out.println("Address : " + address);
    }
}
