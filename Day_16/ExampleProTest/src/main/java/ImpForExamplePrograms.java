package main.java;

import java.util.Arrays;

public class ImpForExamplePrograms {
    public static void main(String[] args) {
        ExamplePrograms ep = new ExamplePrograms();

        System.out.println("Reversed Array: " + Arrays.toString(ep.reverseArray(new int[]{1, 2, 3, 4, 5})));
        ep.printAlphabets();
        ep.printAsciiValues();

        System.out.println("Factorial of 5: " + ep.factorial(5));

        System.out.println("Count Pos/Neg/Zero: " + Arrays.toString(ep.countPosNegZeroFromArray(new int[]{1, -2, 0, 3, -1, 0})));
        System.out.println("Min/Max: " + Arrays.toString(ep.findMinMaxFromArray(new int[]{4, 2, 9, -5, 0})));

        int[] divisible = ep.numbersDivisibleBy9InRange(100, 200);
        System.out.println("Divisible by 9: " + Arrays.toString(divisible));
        System.out.println("Sum of those: " + ep.sumOfArray(divisible));

        System.out.println("1's Complement of 5: " + ep.onesComplement(5));
        int num = 5;
        int twosComp = ep.twoComplement(num);
        System.out.println("2's complement of " + num + " is: " + twosComp);

        System.out.println("Fibonacci (10 terms): " + Arrays.toString(ep.fibonacci(10)));
    
    }
}

