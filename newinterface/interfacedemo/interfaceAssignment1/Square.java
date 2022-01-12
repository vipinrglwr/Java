package newinterface.interfacedemo.interfaceAssignment1;

public class Square implements Shape {

    @Override
    public void areaRectangle(int a, int b) {

    }

    @Override
    public void display() {

    }
int mat;
    @Override
    public void areaSquare(int a) {
        mat = a*a;
    }

    @Override
    public void squareDisplay() {
        System.out.println("Area Of Square IS"+ mat);
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
