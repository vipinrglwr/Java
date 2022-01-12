package armstrong_number;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args)
    {
         int total=0;int number,temp;


        System.out.println("Enter A 3 Digit Number");
        Scanner scanner =new Scanner(System.in);
       int  num =scanner.nextInt();
        number =num;

        while(number != 0)
        {
            temp = number %10;
             total =total +temp*temp*temp;
             number /=10;
        }
        if(total == num)
        {
            System.out.println("It is Armstrong Number ");
        }
        else
        {
            System.out.println("It is not An Armstrong Number");
        }
    }
}
