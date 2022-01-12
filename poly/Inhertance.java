class Vehicle{
    protected String brand = "Ford";
    public void honk(){

        System.out.println("hello Moto");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myFastCar = new Car();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}

class Tata extends Car{
   public String New ="GT";
    public static void main(String[] args) {

        Tata callName =new Tata();

        System.out.println(callName.brand);
    }

}
