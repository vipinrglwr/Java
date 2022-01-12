package practice;

public class Pr1 {
    int a =15;

    public static void main(String[] args) {

    }

}

class Pr2 extends Pr1{
 int a =80;
    void method(int c){
        System.out.println(c);
        System.out.println(super.a);
        System.out.println(this.a);

    }

    public static void main(String[] args) {
        Pr2 data= new Pr2();
        data.method(70);
    }
}
