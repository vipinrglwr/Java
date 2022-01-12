package practice.oopsprograms.inheritance;

public class Inheritance {

    void display(){
        int a =7;
        String name ="John";

        System.out.println(a+" "+name);
    }





}

class Foxin extends Inheritance{

    public static void main(String[] args) {
        Foxin obj =new Foxin();
        obj.display();


//        System.out.println(obj.a+" "+obj.name);


    }

}
