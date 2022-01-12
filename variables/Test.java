package variables;

public class Test {
    int a =5; //instance variables
    static int b=10; //static variables

    public static void main(String[] args) {
        int local =15;//local variables

        Test test = new Test();

        System.out.println("value of a is"+test.a);
        System.out.println("value of b is"+local);
        System.out.println("value of a is"+test.b);
    }
}
