package poly.PolyMorphism;

public class OverridingBank {
    int getRateOfInterest(){
        return 0;
    }

}

class SBI extends OverridingBank{
    int getRateOfInterest(){
        return 5;
    }

}

class YesBank extends OverridingBank{
    int getRateOfInterest(){
        return 105;
    }

}

class Mahindra extends OverridingBank {
    int getRateOfInterest(){
        return 78;
    }

}

class Test2{
    public static void main(String[] args) {
        SBI s =new SBI();
        YesBank y =new YesBank();
        Mahindra m =new Mahindra();

        System.out.println("SBI rate of interest:"+s.getRateOfInterest());
        System.out.println("SBI rate of interest:"+y.getRateOfInterest());
        System.out.println("SBI rate of interest:"+m.getRateOfInterest());


    }
}