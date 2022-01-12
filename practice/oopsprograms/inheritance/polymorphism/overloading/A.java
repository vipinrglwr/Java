package practice.oopsprograms.inheritance.polymorphism.overloading;

public class A {
    int sum;

    void display(int a,int b){
        sum = a+b;
    }
}

class B extends A {
    int multiply ;
    void display(int c,int d){
        multiply =c*d;
    }
}

class C extends B{
int divide;
    void display(int e ,int f){
        divide = e/f;
    }
}

class TestOverloading{
    public static void main(String[] args) {
        A a =new A();
        a.display(5,4);
        System.out.println(a.sum);

        B b =new B();
        b.display(4,4);


        C c=new C();
        c.display(10,2);
    }

}

