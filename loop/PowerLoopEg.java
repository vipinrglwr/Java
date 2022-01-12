package loop;

import java.util.Scanner;

public class PowerLoopEg {
    public static void main(String[] args) {
//
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter A Number 1");
//        int no = scanner.nextInt();
//
//        Scanner data =new Scanner(System.in);
//        System.out.println("Enter a Number 2");
//        int two= data.nextInt();

int base =2;
int exponent=3;
int sum=1;

        for (int i=0;i<exponent;i++){
            sum =sum+(int)Math.pow(base,i);
        }
        System.out.println(sum);






    }
}

//
//    int ans = (int) Math.pow(5,2);
//
//System.out.println(+ans);