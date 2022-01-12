package recursion;

public class FactorialLoop {

    static void factorial(int a){
        int temp=1;
        for(int i = 5; i>0;i--){
            temp=temp*i;
        }
        System.out.println(temp);

    }



    public static void main(String[] args) {
        FactorialLoop.factorial(5);
    }
}
