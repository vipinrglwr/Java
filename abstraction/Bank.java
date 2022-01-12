package abstraction;

abstract class Bank{
    Bank(){
        System.out.println("Bank Created");
    }

    abstract int getRateOfInterest();

    void getDetails(){
        System.out.println("Bank's Details");
    }
}
