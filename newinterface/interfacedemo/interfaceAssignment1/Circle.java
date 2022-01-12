package newinterface.interfacedemo.interfaceAssignment1;

public class Circle implements Shape{


    @Override
    public void areaRectangle(int a, int b) {

    }

    @Override
    public void display() {

    }

    @Override
    public void areaSquare(int a) {

    }

    @Override
    public void squareDisplay() {

    }
double A;
    @Override
    public void areaCircle(int r) {
        A=3.14*(r*r);
    }

    @Override
    public void circleDisplay() {
        System.out.println("Area Of Circle"+A);
    }

    @Override
    public void areaTriangle(int breath, int height) {

    }


    @Override
    public void triangleDisplay() {

    }
}
