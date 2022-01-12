package abstraction.egabstract;

public class TestClass3{
    public static void main(String[] args) {
        Student r =new Math();

        r.getMarks();
        System.out.println("Obtained Marks IN Maths :- "+r.getMarks());

        Student s =new Science();
        System.out.println("Obtained Marks IN Science :- "+s.getMarks());

        Student h =new History();
        System.out.println("Obtained Marks IN History :- "+h.getMarks());

        System.out.println("Final Result in Percentage");

        float x =(r.getMarks()+s.getMarks()+h.getMarks());
        float y =(300);
        System.out.println(x/y*100);


//        System.out.println("Total Percentage :-"+(r.getMarks()+s.getMarks()+h.getMarks()));
    }

}

//
