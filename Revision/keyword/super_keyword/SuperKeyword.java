package Revision.keyword.super_keyword;

public class SuperKeyword {



    //Access variable from parent Class
    String name ="Vipin";
    String address = "Jaiswal Colony";





    void wrestler (){
        System.out.println("Sheimus");
    }

    SuperKeyword(){
        System.out.println("Dominic");
    }






}

class Keyword extends SuperKeyword{
    int id =05;
    String companyName ="Spotify";

    void personality()
    {

        System.out.println(id);
        System.out.println(companyName);
        System.out.println(super.name);
        System.out.println(super.address);  ///Access Instance variable



//        super.wrestler();     //Access Method Through Parent Class




    }

//    Keyword(){
//        System.out.println("Nature");
//    }

    public static void main(String[] args) {
     Keyword key =new Keyword();
     key.personality();

    }
}
