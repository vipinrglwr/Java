package keyword.finalkeyword;
//final keyword for method

public class MethodFinal {

    final void run(){
        System.out.println("Bike is Running");
    }
}

class V extends MethodFinal{
    public static void main(String[] args) {
        MethodFinal data= new MethodFinal();
        data.run();
    }

}
