package main.java;
//import java.util.Scanner;
public class ExamplePrograms {

	public int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Print all alphabets
    public void printAlphabets() {
        System.out.println("Alphabets from a to z:");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

 // Print ASCII values from 0 to 127
    public void printAsciiValues() {
        System.out.println("ASCII values from 0 to 127:");
        for (int i = 0; i < 128; i++) {
            if (i >= 32 && i <= 126) {
                System.out.println(i + " : " + (char) i);
            }
            else {
                System.out.println(i + " : [non-printable]");
            }
        }
    }

    // 4. Factorial
    public long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 5. Count positives, negatives, zeros from array
    public int[] countPosNegZeroFromArray(int[] arr) {
        int pos = 0, neg = 0, zero = 0;
        for (int num : arr) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;
        }
        return new int[]{pos, neg, zero};
    }

    // 6. Min and Max from array
    public int[] findMinMaxFromArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    // 7. Numbers divisible by 9 in range
    public int[] numbersDivisibleBy9InRange(int start, int end) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % 9 == 0) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // 8. One's complement
    public int onesComplement(int num) {
        return ~num;
    }

    // 9. Two's complement
    public int twoComplement(int num) {
        return ~num + 1;
    }

    // 10. fibonacci
    public int[] fibonacci(int n) {
        if (n <= 0) return new int[0];
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
