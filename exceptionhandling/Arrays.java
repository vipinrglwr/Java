package exceptionhandling;

public class Arrays {
    public static void main(String[] args) {



        try
        {
            int arr[] ={1,2,3,4,5};
//        System.out.println(arr.length);
            System.out.println(arr[6]);
        }catch(Exception e)
        {

            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
//            System.out.println("Something Went Wrong");
        }


    }
}
