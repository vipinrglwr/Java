package practice;

import org.w3c.dom.ls.LSOutput;

public class Static {
    int id ;
    String name;
    static private String surname ="Singh";


    public Static(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Member Of the Family:- "+id+" Name Of The Family Member :- "+name+"Surname "+surname);
    }

    public static void main(String[] args){

        Static mem1 =new Static(1,"kamalpreet");
        Static mem2 =new Static(2,"Honeypreet");
        Static mem3 =new Static(3,"Chawanpraspreet");
        Static mem4 =new Static(4,"harpreet");

        mem1.display();
        mem2.display();
        mem3.display();
        mem4.display();

    }
}
