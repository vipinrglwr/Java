package constructer;

public class Person {
    int id;
    String name;

//    Person(int id){
//        this.id=id;
//    }

    Person(int id,String name){
        this.id=id;
        this.name=name;
    }


    public static void main(String[] args) {
        Person person=new Person(5,"hello");
        Person student=new Person(15,"Foxin");

        System.out.println("id"+" "+person.id);
        System.out.println("id"+" "+person.name);

        System.out.println("id"+" "+student.id);
        System.out.println("id"+" "+student.name);


    }
}
