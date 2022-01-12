package newinterface.interfacedemo;

public class Car implements  Vehicle {
    int speed =100;

    @Override
    public void applyBrakes(int decrement) {
        speed =speed - decrement;
    }

    @Override
    public void display() {
        System.out.println("Speed Is"+speed);
    }


}
