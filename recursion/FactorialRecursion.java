package recursion;

public class FactorialRecursion {
    static int value=1; static int n=5;
    static int factorial(int f){

        if(f == 1)
        {
         return 1;
        }
        return (f*factorial(f-1));
    }

    public static void main(String[] args) {
        System.out.println("Factorial Of 5 is"+factorial(5));
    }

}
