package newinterface.interfacedemo.interfaceAssignment1;

public class TestRectangle {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.areaRectangle(4,6);
        shape.display();

        Shape newShape = new Square();
        newShape.areaSquare(4);
        newShape.squareDisplay();

        Shape newCircle = new Circle();
        newCircle.areaCircle(4);
        newCircle.circleDisplay();

        Shape newTriangle = new Triangle();
        newTriangle.areaTriangle(3,3);
        newTriangle.triangleDisplay();

    }
}
