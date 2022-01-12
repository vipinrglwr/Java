package poly;

public class Animal {
    public void sound(){
        System.out.println("in sound");
    }
}

class Dog extends Animal{
    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.sound();
    }

}
