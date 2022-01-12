package keyword.thiskeyword;
//FOR CONSTRUCTER call default constructer in to parametic contructer
public class J {

    J()
    {
        System.out.println(" Hello P"); //DT how this can be current object

    }

    J (int a){
//        this();

        System.out.println(a);
    }


}

class TestJ{
    public static void main(String[] args) {
        J data1 = new J(10);
    }



}
