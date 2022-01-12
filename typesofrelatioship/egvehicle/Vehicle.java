package typesofrelatioship.egvehicle;

public class Vehicle {
    int speed;
    int mileage;

    void brakes(){
        System.out.println("Braking");
    }

    void accelerate(){
        System.out.println("accelerating");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
