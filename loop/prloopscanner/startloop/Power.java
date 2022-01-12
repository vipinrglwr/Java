package loop.prloopscanner.startloop;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base= scanner.nextInt();
        int exponent= scanner.nextInt();
        int result=1;

        while(exponent!=0){
            result=result*base;
            exponent --;
        }
        System.out.println("Result"+result);
    }
}
