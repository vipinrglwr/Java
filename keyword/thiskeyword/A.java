package keyword.thiskeyword;
//For method
public class A {
    void b(){
        System.out.println("Hello B");
    }

    void c(){
        System.out.println("Hello C");

    }

     void k(){
         b();
     }
}

class B{

    public static void main(String[] args) {

        A data= new A();
        data.b();
        data.c();
        data.k();
    }

}
