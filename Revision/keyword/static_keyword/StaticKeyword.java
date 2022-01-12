package Revision.keyword.static_keyword;

public class StaticKeyword {

    static String name = "Vipin";

    static  void surname(){
        System.out.println("Too Fast Too Furios");
    }

    static {
        System.out.println("giesel");
    }

    public static void main(String[] args)
    {
        System.out.println(name);             // Static Variables we cannot create object to access variable
        surname();                            //static variable
    }

}
