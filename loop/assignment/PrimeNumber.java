package loop.assignment;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int showdata;
        boolean isPrime =true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number");
        int data= scanner.nextInt();

       for(int i=2;i<=data/2;i++) {

           showdata = data % i;
           if (showdata == 0) {
               isPrime = false;
               break;
           }
       }
           if(isPrime)
               System.out.println(" It is an prime number");
           else
           System.out.println(" It is an not  prime number");
       }

    }

