package dowhileswitch;

public class Rectangle extends Shape{
   private int length,breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    double calculateArea() {
        return (length*breath);
    }
}
