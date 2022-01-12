package controlstatement.prcontrolstatement;

public class Calculator{
    public static void main(String[] args) {
        int a=15;
        int b=8;
        String c ="add";
        String d ="sub";
        String e ="mul";
        String f ="division";


        switch("mul"){

            case "add":{
                System.out.println(a+b);
                break;
            }

            case "mul":{
                System.out.println(a*b);
                break;
            }

            case "division":{
                System.out.println(a/b);
                break;
            }

            case "sub":{
                System.out.println(a-b);
                break;
            }

        }

    }
}
