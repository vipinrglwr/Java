package keyword.superkeyword;

public class Method {
    void fly(){
        System.out.println("Birds are Flying");
    }
}

class Pigeon extends Method{
    void fly(){

        System.out.println("Pigeon is flying");
        this.fly();
    }

    public static void main(String[] args) {
        Pigeon pigeon =new Pigeon();
        pigeon.fly();
    }

}
