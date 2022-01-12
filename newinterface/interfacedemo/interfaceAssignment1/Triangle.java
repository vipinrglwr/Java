package newinterface.interfacedemo.interfaceAssignment1;

public class Triangle implements Shape{

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

    @Override
    public void areaCircle(int r) {

    }

    @Override
    public void circleDisplay() {

    }
double K;
    @Override
    public void areaTriangle(int breath,int height) {
K = breath*height/2;
    }

    @Override
    public void triangleDisplay() {
        System.out.println("Area Of Triangle" + K);
    }
}
