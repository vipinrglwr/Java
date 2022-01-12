class Animal{
    void eat(){
        System.out.println("Driving");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class TestInheritance{
    public static void main(String[] args) {
        Dog r =new Dog();
        r.eat();
        r.bark();


    }
}

//Single Inhertance