package keyword.thiskeyword;

//FOR CONSTRUCTOR //call Parametric  constructor into Default constructor
public class K {

    K (){
        this(20);
        System.out.println(" Hello P");

    }

    K (int a){
        System.out.println(a);
    }


}

class TestK{
    public static void main(String[] args) {
        K data1 = new K(20);
    }



}

