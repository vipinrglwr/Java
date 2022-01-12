package practice.employee_assignment;

import java.util.Scanner;

public class Employee {
    private int id, sal;
    private String name, dept;

    public Employee(int id, int sal, String name, String dept) {
        this.id = id;
        this.sal = sal;
        this.name = name;
        this.dept = dept;
    }

    public Employee() {
    }

    void accept() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID");
        id = scanner.nextInt();

        System.out.println("Enter Salary");
        sal = scanner.nextInt();

        System.out.println("Enter a Name");
        name = scanner.next();

        System.out.println("Enter a Department");
        dept = scanner.next();
        System.out.println("**********************************");
        System.out.println("Employee Detail");
        System.out.println(" ID    : " + id);
        System.out.println(" Salary: " + sal);
        System.out.println(" Name  : " + name);
        System.out.println(" Department : " + dept);
        System.out.println("**********************************");
    }

    public int getSal() {
        return sal;
    }

    void display()
    {

//        System.out.println("\n Id \t Name \t Salary \t Department ");
//        System.out.println("\n "+id+" \t "+name+" \t "+sal+" \t "+dept);

    }

}

class Manager extends Employee{
    private int bonus;


    Manager()
    {

        super();

    }

    Manager(int id, int sal, String name, String dept,int b)
    {

        super(id,sal,name,dept);



    }


void accept(){
    super.accept();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter A Bonus");
    bonus = scanner.nextInt();

}


void display(){
super.display();
this.accept();
int value = this.bonus+getSal();
    System.out.println(" Total Salary : "+value);
    System.out.println("**********************************");

}

}


class TestEmployee{
    public static void main(String[] args) {
        Manager manager = new Manager();
       manager.display();

    }
}
