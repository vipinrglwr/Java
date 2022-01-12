package dowhileswitch;

public class Circle extends Shape{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (22*radius*radius)/7;
    }
}
