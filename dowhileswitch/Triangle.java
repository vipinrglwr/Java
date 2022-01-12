package dowhileswitch;

public class Triangle extends Shape {
   private int breath;
   private int height;

    public Triangle(int breath, int height) {
        this.breath = breath;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (0.5*breath*height) ;
    }
}
