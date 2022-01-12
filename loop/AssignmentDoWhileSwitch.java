package loop;

import java.util.Scanner;

public class AssignmentDoWhileSwitch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("List");
        System.out.println("Case:1 - Area of Triangle");
        System.out.println("Case:2 - Area of Circle");
        System.out.println("Case:3 - Area of Rectangle");
        System.out.println("Enter A value Above the following List");
        int data= scanner.nextInt();

        switch(data){

            case 1: System.out.println("Please enter base and height of triangle: ");
                double base = scanner.nextFloat();
                double height = scanner.nextFloat();
                double areaTriangle = (base* height) / 2;
                System.out.println("Area of triangle is: " + areaTriangle);
                break;

            case 2:
                System.out.println("PLease Enter a radius of a circle");
                double radius = scanner.nextFloat();
                double areaCircle=(22*radius*radius)/7;
                System.out.println("area of circle :"+ areaCircle);
                break;
            case 3:
                System.out.println("PLease Enter a length and breath of a reactangle");
                int length = scanner.nextInt();
                int breath = scanner.nextInt();
                int areaReactanglr=length*breath;
                System.out.println("area of reactangle :"+ areaReactanglr);
                break;
        }
    }
}
