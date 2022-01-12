package poly.PolyMorphism;

public class Adder{
    static int add(int a,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return(a+b+c);
    }
}

class TestOverloading1{
    public static void main(String[] args) {
        System.out.println(Adder.add(45,87));
        System.out.println(Adder.add(5,2,32));
    }
}
