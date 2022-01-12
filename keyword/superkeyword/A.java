package keyword.superkeyword;

import kotlin.jvm.internal.MagicApiIntrinsics;
import org.w3c.dom.ls.LSOutput;

public class A {
    A(){
        System.out.println("Im in parent class");
    }
}

class B extends A{
    B(){
        System.out.println("Im in child 1");
    }

}

class C extends B {
    C(){
        System.out.println("Im in C");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}