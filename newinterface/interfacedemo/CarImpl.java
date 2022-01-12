package newinterface.interfacedemo;

public class CarImpl {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.applyBrakes(48);
        vehicle.display();
    }
}
