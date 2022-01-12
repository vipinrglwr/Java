package exceptionhandling;

public class ExceptionPropagation {      //In exception propagation used when one method cannot solve the exception
                                        // the it going to another method to sole the exception by caller method


    void  m1()
    {
        System.out.println(10/0);
    }
    void m2()
    {
        m1();
    }
    void m3()
    {
        try
        {
            m2();
        }catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
        exceptionPropagation.m3();



    }

}
