package exceptionhandling;

import operators.Arithmetic;

public class ExceptionNested {
    public static void main(String[] args) {

        try{
            int a =10/0;
            System.out.println(a);

            try
            {
                int arr[] = {1,2,3,4,5};
                System.out.println(arr[5]);

            }
            catch(NullPointerException e)
            {
                System.out.println("Something Went Wrong");
                System.out.println(e.getMessage());
            }


        }catch(ArithmeticException e1)
        {
            System.out.println(e1.getMessage());
//            System.out.println(e.getSuppressed());

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}


