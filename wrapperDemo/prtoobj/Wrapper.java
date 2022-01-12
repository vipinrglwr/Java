package wrapperDemo.prtoobj;

public class Wrapper {



    public static void main(String[] args) {
        int a =10;
        Integer i =Integer.valueOf(a);

        Integer j=a;

        System.out.println(a+" "+i+" "+j);  //Autoboxing

        Integer b=Integer.valueOf(3);

        int p =b;
        int q =b;

        System.out.println(b +" "+p+" "+q);
//        System.out.println(b.getClass().getSimpleName());


        String number ="50";
        Integer number1=Integer.valueOf(number);

        System.out.println(number + " " +number1);

    }


}
