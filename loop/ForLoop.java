package loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number. ");
        int no =sc.nextInt();
//        int no=Integer.parseInt(args[0]); convert string to integer 1.go to configuration set values 2.then run the program
        System.out.println("Number is" +no);

        for(int i=1;i<=10;i++){
            System.out.println(no*i);
        }

    }

    public static class Looping {
        public static void main(String[] args) {
    //        for(int i=0;i<=15;i++){
    //            System.out.println(i);
    //        }

            //odd And Even

            for(int i=0;i<=10;i++){                            //Even
                if((i%2)==0){
                    System.out.println(i);
                }
            }

            for(int i=0;i<=10;i++){                           //Odd
                if((i%2) !=0){
                    System.out.println(i);
                }
            }





            for(int i=0;i<=20;i++){                      //Both
                if(i%2==0){
                    System.out.println("Number is Even");
                    System.out.println(i);
                }else{
                    System.out.println("Number Is Odd");
                    System.out.println(i);
                }

            }
        }
    }
}

//int i[]={1.......10}
//int even[]
//int odd[]
//scanner use for odd even using range
//in one loop
