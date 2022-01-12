package custom_marker_interface;

interface A{
}

class B implements A{

    static void forloop(){
        System.out.println("Pune Is A city");

    }
}

class TestInterface{
    public static void main(String[] args) {
        B.forloop();
    }


}