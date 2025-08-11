package oops;

class Box<T> {
    private T length;
    private T breadth;
    private T radius;
    private T side;
    private T base;
    private T height;
    private T message;
    public Box(){
        System.out.println("This is Genarics Concept Example");
    }

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

    public void setMessage(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }
}
