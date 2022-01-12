package practice.oopsprograms.inheritance.polymorphism;

import poly.Animal;

public class Polymorphism {

    void animalSound(){
        System.out.println("Animals Are making sound");
    }

}

class Dog extends Polymorphism{
    void animalSound(){
        System.out.println("The dog is Barking");
    }
}

class Cat extends Polymorphism{
    void animalSound(){
        System.out.println("The piegeon are chirping");
    }
}
 class Main{

     public static void main(String[] args) {
         Polymorphism poly = new Polymorphism();
        poly.animalSound();
         Dog dog =new Dog();
         dog.animalSound();

         Cat cat =new Cat();
         cat.animalSound();
     }
 }


