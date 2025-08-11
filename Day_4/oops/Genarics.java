package oops;

public class Genarics {
    public static void main(String[] args) {
        System.out.println("Rectangle Area using Integer-------------");
        Box<Integer> rectangleBox = new Box<>();
        rectangleBox.setLength(10);
        rectangleBox.setBreadth(5);
        int rectangleArea = rectangleBox.getLength() * rectangleBox.getBreadth();
        System.out.println("Area of Rectangle: " + rectangleArea);

        System.out.println("Circle Area using Double------------------");
        Box<Double> circleBox = new Box<>();
        circleBox.setRadius(7.0);
        double circleArea = Math.PI * circleBox.getRadius() * circleBox.getRadius();
        System.out.println("Area of Circle: " + circleArea);

        System.out.println("Square Perimeter using Float----------------");
        Box<Float> squareBox = new Box<>();
        squareBox.setSide(4.5f);
        float squarePerimeter = 4 * squareBox.getSide();
        System.out.println("Perimeter of Square: " + squarePerimeter);

        System.out.println("Triangle Area using Double---------------------");
        Box<Double> triangleBox = new Box<>();
        triangleBox.setBase(6.0);
        triangleBox.setHeight(3.0);
        double triangleArea = 0.5 * triangleBox.getBase() * triangleBox.getHeight();
        System.out.println("Area of Triangle: " + triangleArea);

        System.out.println("Display message using String-------------------");
        Box<String> textBox = new Box<>();
        textBox.setMessage("Above the complete examples of Generic class using String class.");
        System.out.println(textBox.getMessage());
    }

}
