package assignment;

import java.util.Scanner;

public class Leap {

    public static void main(String[] args) {

        int choice;
        do{
            System.out.println("1. 2019");
            System.out.println("2. 2020");
            System.out.println("3. 2021");
            System.out.println("4. 2022");
            System.out.println("5. 2023");
            System.out.println("6. 2024");
            System.out.println("Select Any One Year To Find Leap Year :- ");
            Scanner scanner= new Scanner(System.in);
             choice= scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.println(" 2019 is not a leap Year ");
                    break;


                case 2:
                    System.out.println(" 2020 is  a last leap Year ");
                    break;
                case 3:
                    System.out.println(" 2021 is not a leap Year ");
                    break;
                case 4:
                    System.out.println(" 2022 is not a leap Year ");
                    break;
                case 5:
                    System.out.println(" 2023 is not a leap Year ");
                    break;
                case 6:
                    System.out.println(" 2024 will be next leap Year ");
                    break;
                default:
                    System.out.println("Data is not Available");

            }


        }while(choice<=6);
    }
}

