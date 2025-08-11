class Box<T> {
    private T length;
    private T breadth;
    private T radius;
    private T side;
    private T base;
    private T height;
    private String message;

    public void setLength(T length) {
        this.length = length;
    }

    public T getLength() {
        return length;
    }

    public void setBreadth(T breadth) {
        this.breadth = breadth;
    }

    public T getBreadth() {
        return breadth;
    }

    public void setRadius(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    public void setSide(T side) {
        this.side = side;
    }

    public T getSide() {
        return side;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getBase() {
        return base;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getHeight() {
        return height;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
public class Genarics {
    public static void main(String[] args) {
        // Rectangle Area using Integer
        Box<Integer> rectangleBox = new Box<>();
        rectangleBox.setLength(10);
        rectangleBox.setBreadth(5);
        int rectangleArea = rectangleBox.getLength() * rectangleBox.getBreadth();
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Circle Area using Double
        Box<Double> circleBox = new Box<>();
        circleBox.setRadius(7.0);
        double circleArea = Math.PI * circleBox.getRadius() * circleBox.getRadius();
        System.out.println("Area of Circle: " + circleArea);

        // Square Perimeter using Float
        Box<Float> squareBox = new Box<>();
        squareBox.setSide(4.5f);
        float squarePerimeter = 4 * squareBox.getSide();
        System.out.println("Perimeter of Square: " + squarePerimeter);

        // Triangle Area using Double
        Box<Double> triangleBox = new Box<>();
        triangleBox.setBase(6.0);
        triangleBox.setHeight(3.0);
        double triangleArea = 0.5 * triangleBox.getBase() * triangleBox.getHeight();
        System.out.println("Area of Triangle: " + triangleArea);

        // Display message using String
        Box<String> textBox = new Box<>();
        textBox.setMessage("Above the complete examples of Generic class using String class.");
        System.out.println(textBox.getMessage());
    }

}
