package loop.assignment;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
int data;

        System.out.println("Choose A year");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        data=scanner.nextInt();
        while (data <2025){
            if(data % 4 == 0){
                System.out.println(data +"It Is a Leap Year");
                data++;
            }
            else{
                System.out.println(data + "It Is not a Leap Year");
                data++;
            }

        }

    }
}
