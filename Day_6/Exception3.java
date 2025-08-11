public class Exception3 {
    public static void main(String[] args) {
        int[] numbers = {100,20};
        try {
            System.out.println("Outer try block");

            try {
                System.out.println("Inner try block");
                int result = numbers[0] / numbers[1];
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner try's catch: Divide by zero!");
            }

            int value = numbers[2];
            System.out.println("Value: " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds!");
        }
        finally{
            System.out.println("Example of outer/Inner try block");
        }


    }
}
