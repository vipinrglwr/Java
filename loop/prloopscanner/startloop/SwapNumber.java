package loop.prloopscanner.startloop;

public class SwapNumber {
    public static void main(String[] args) {
        int temp;
        int a=10;
        int b=20;

        if(a!=b){
            temp=a;
            a=b;
            b=temp;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
