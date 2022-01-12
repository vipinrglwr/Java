package practice.oopsprograms.inheritance.polymorphism.overriding;

public class A {

    void display(){
        System.out.println("This Is Dell Laptop");
    }
}

class B extends A {
    void display(){
        System.out.println("This Is APPLE Laptop");
    }
}

class C extends B{

    void display(){
        System.out.println("THis is lenovo laptop");
    }
}

class TestOverriding{
    public static void main(String[] args) {
        A a =new A();
        a.display();

        B b =new B();
        b.display();


        C c=new C();
        c.display();
    }

}
