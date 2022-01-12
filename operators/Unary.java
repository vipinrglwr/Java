package operators;

//Unary Operators
//tilt operator
//

public class Unary {
    static int a=5;

    public static void main(String[] args) {
         int b=(~1);

         boolean c =(!true);

         int d =(10%2);

        System.out.println(d);

        System.out.println(c);

        System.out.println(b);//tilt Operator

        System.out.println(a++);//5
        System.out.println(++a);//7
        System.out.println(a--);//7
        System.out.println(--a);//5
    }
}
