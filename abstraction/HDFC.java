package abstraction;

public class HDFC extends Bank{

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("HDFC BAnk");
    }

    @Override
    int getRateOfInterest() {
        return 8;
    }
}
