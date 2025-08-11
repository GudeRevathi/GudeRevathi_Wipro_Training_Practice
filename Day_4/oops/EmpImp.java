package oops;

public class EmpImp {
    public static void main(String[] args) {

        Emp e1 = new Emp(1, "John", "HR", 50000);
        Emp e2 = new Emp(2, "Alice", "IT", 60000);
        Emp e3 = new Emp(3, "Bob", "Sales", 45000);
        Emp e4 = new Emp(4, "Nina", "Finance", 55000);
        Emp e5 = new Emp(5, "Tom", "Marketing", 48000);


        Emp e6 = new Emp();
        e6.setId(6);
        e6.setName("Sara");
        e6.setDepartment("HR");
        e6.setSalary(47000);

        Emp e7 = new Emp();
        e7.setId(7);
        e7.setName("Mike");
        e7.setDepartment("IT");
        e7.setSalary(62000);

        Emp e8 = new Emp();
        e8.setId(8);
        e8.setName("Emma");
        e8.setDepartment("Sales");
        e8.setSalary(49000);

        Emp e9 = new Emp();
        e9.setId(9);
        e9.setName("David");
        e9.setDepartment("Finance");
        e9.setSalary(53000);

        Emp e10 = new Emp();
        e10.setId(10);
        e10.setName("Linda");
        e10.setDepartment("Marketing");
        e10.setSalary(51000);



        System.out.println(e6);
        System.out.println(e7);
        System.out.println(e8);
        System.out.println(e9);
        System.out.println(e10);
        }
}



