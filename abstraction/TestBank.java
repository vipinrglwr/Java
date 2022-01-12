package abstraction;

public class TestBank{

    public static void main(String[] args) {
        Bank obj = new SBI();

        obj.getDetails();
        System.out.println("Interest of "+ obj.getRateOfInterest()+"%");

        obj = new HDFC();

        obj.getDetails();
        System.out.println("Interest of "+ obj.getRateOfInterest()+"%");
    }
}
