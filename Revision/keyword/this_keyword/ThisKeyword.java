package Revision.keyword.this_keyword;

class A {

    void movie(){
        System.out.println("Sherlock Holmes");

    }

    void movie1(){
        this.movie();
        System.out.println("Sherlock Holmes season 2");

    }


    public static void main(String[] args) {
        A a = new A();
        a.movie1();
    }
}















//public class ThisKeyword {     //this.variable
//    String name;
//
//    ThisKeyword(String name){
//        this.name =name;
//    }
//
//    void out(){
//        System.out.println(name);
//    }
//
//    public static void main(String[] args) {
//        ThisKeyword thisKeyword = new ThisKeyword("Regulwar");
//        ThisKeyword thisKeyword2 = new ThisKeyword("toretoowar");
//        thisKeyword.out();
//        thisKeyword2.out();
//
//
//    }
//}


