package dowhileswitch;

public class Square extends Shape {
    int s;

    public Square(int s) {
        this.s = s;
    }

    @Override
    double calculateArea() {
        return Math.pow(s,2);
    }
}
