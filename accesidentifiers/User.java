package accesidentifiers;

public class User {
    private String name ="abc";

    public void DisplayPublic(){
        System.out.println("Hello Public"+name);
    }

    private void DisplayPrivate(){
        System.out.println("Hello Private"+name);
    }
//
//     default DisplayDefault(){
//        System.out.println("Hello Default"+name);
//    }

    protected void DisplayProtected(){
        System.out.println("Hello Protected"+name);
    }
}
