class FactorialProgram {
    public void factorialImp(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}
public class Factorial {
    public static void main(String[] args) {
        FactorialProgram factorial = new FactorialProgram();
        factorial.factorialImp(4);
    }
}






