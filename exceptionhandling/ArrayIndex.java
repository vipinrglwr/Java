package exceptionhandling;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {

try {
    int arr[] = {1, 2, 3, 4, 5};

    System.out.println("Enter A Index Number");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    for (int i = 0; i < arr[num]; i++) {
        System.out.println("Yess");
    }
}catch(IndexOutOfBoundsException e){
    System.out.println("Something Went Wrong");
    System.out.println(e.getMessage());

        }

        }


    }
