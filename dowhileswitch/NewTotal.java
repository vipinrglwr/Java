package dowhileswitch;

import java.util.Scanner;

public class NewTotal {
    public static void main(String[] args) {
        int ch;

        do{
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("5. Exit");
            System.out.println("Enter Your choice");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();

            switch(ch){

                case 1: System.out.println("Please enter breath and height of triangle: ");
                    int breath = scanner.nextInt();
                    int height = scanner.nextInt();
                    Shape triangle =new Triangle(breath,height);
                    System.out.println("Area of triangle is: " + triangle.calculateArea());
                    break;

                case 2:
                    System.out.println("PLease Enter a length and breath of a rectangle");
                    int length = scanner.nextInt();
                    int breath1 = scanner.nextInt();
                   Shape rectangle =new Rectangle(length,breath1);
                    System.out.println("area of rectangle :" + rectangle.calculateArea());
                    break;

                case 3:
                    System.out.println("PLease Enter a side  of a Square");
                    int side = scanner.nextInt();
                    Shape square =new Square(side);
                    System.out.println("area of Square :" + square.calculateArea());
                    break;

                case 4:
                    System.out.println("PLease Enter a radius of a circle");
                    int radius = scanner.nextInt();
                    Shape circle = new Circle(radius);
                    System.out.println("area of circle :"+ circle.calculateArea());
                    break;

                default:
                case 5:
                    System.exit(0);

            }
        }while(ch<3);

    }
}
