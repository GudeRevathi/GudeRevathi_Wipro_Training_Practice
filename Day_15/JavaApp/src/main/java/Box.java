package main.java;

public class Box {

    // 1. Area of a circle
    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 2. Area of a triangle
    public double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // 3. Area of a square
    public double areaOfSquare(double side) {
        return side * side;
    }

    // 4. Area of a rectangle
    public double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // 5. Simple Interest
    public double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // 6. Amount without parameters
    public double calculateAmount() {
    	double principal = 1000;
        double rate = 5;
        double time = 2;

        // Compound interest formula only
        double amount = principal * Math.pow((1 + rate / 100), time);
        return amount;
    }
}

