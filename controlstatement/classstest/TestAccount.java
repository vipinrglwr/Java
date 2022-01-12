package controlstatement.classstest;

import dowhileswitch.NewTotal;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        int data;
        Account obj = new Account();
        obj.DisplayData();
        do {
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter Your Request ");
            Scanner scanner = new Scanner(System.in);
            data = scanner.nextInt();

            switch (data)
            {
                case 1:
                    obj.DisplayData();
                    System.out.println("Enter A Withdraw Amount :-");
                    double  amount = scanner.nextDouble();
                    obj.withdrawMoney(amount);
                    break;

                case 2:
                    obj.DisplayData();
                    System.out.println("Enter A Deposit Amount :-");
                    double amount1 = scanner.nextDouble();

                    obj.depositMoney(amount1);
                    break;

//                    System.out.println("Updated Balance :-"+(amount1));
//                    System.out.println("Total Balance :-"+(amount1+amount));

                case 3:
obj.Display();
                default:
                    System.out.println("User Input Invalid");

            }

        }while (data<3) ;

    }
}
