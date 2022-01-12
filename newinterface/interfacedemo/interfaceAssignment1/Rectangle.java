package newinterface.interfacedemo.interfaceAssignment1;

public class Rectangle implements Shape {

    int area;

    @Override
    public void areaRectangle(int length, int breath) {
        area = length*breath;
    }

    @Override
    public void display() {
        System.out.println("Area Of Reactangle is "+ area);
    }

    @Override
    public void areaSquare(int a) {

    }

    @Override
    public void squareDisplay() {

    }

    @Override
    public void areaCircle(int r) {

    }

    @Override
    public void circleDisplay() {

    }

    @Override
    public void areaTriangle(int breath,int height) {

    }

    @Override
    public void triangleDisplay() {

    }


}
