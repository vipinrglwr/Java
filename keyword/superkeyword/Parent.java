package keyword.superkeyword;

public class Parent {
    int a=20;
}

class Child extends Parent{
    int a =15;

    void show(int a){

        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);

    }

    public static void main(String[] args) {
        Child child = new Child();
        child.show(50);

    }

}
