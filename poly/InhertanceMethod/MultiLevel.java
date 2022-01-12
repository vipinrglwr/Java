package poly.InhertanceMethod;

class MultiLevel{
    void eat(){
        System.out.println("Driving");
    }
}

class Dog extends MultiLevel{
    void bark(){
        System.out.println("Barking");
    }
}

class Goat extends Dog{
    void roar(){
        System.out.println("Roaring");
    }
}

class TestInheritance{
    public static void main(String[] args) {
        Goat r =new Goat();
        r.eat();
        r.bark();
        r.roar();


    }
}

//  Multi-Level Inheritance
