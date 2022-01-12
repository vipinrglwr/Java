package Revision.keyword.this_keyword;

public class ThisDemo {
    String name;
    int  rollno;
    String address;

    public ThisDemo(String name, int rollno, String address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    void display()
    {
        System.out.println("Name "+name+" Roll-No "+rollno+" Address "+address);
    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo("vipin",12,"WashingTonDc");
        thisDemo.display();
    }

}
