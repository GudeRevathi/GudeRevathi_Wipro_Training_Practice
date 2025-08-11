import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int num= sc.nextInt();
        System.out.println("Enter Denominator: ");
        int dem=sc.nextInt();

        try {
            int res=num/dem;
            System.out.println("Reasult is: "+res);
        }catch(Exception e){
            System.out.println("Cant divisible by zero");

        }
        finally{
            System.out.println("finally block");
        }
    }



}
