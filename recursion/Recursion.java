package recursion;
//Eg Sum
public class Recursion {
    static int value=0; static int n=0;
    static void sum(int a){
        n++;
        if(a>=n){
            value=value+n;
            System.out.println(value);
sum(a);
        }
    }


    public static void main(String[] args){
Recursion.sum(5);
//        sum();


    }



}
