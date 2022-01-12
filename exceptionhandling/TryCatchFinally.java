package exceptionhandling;

public class TryCatchFinally {

    public static void main(String[] args) {

        try
        {                                      //it is used which exception which we want to handle
            System.out.println(1);
            System.out.println(2);
            System.out.println(10/0);
            System.out.println(3);
        }
        catch(Exception e)
        {                                      //block of code to handle the exception
            System.out.println("Invalid Code");
        }




        finally
        {                                      //It is used to write a necessary code  wheather eception handled or not
            System.out.println(4);
            System.out.println(5);
        }
//







    }

}
