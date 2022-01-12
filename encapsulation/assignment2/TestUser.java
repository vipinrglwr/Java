package encapsulation.assignment2;

public class TestUser {
    public static void main(String[] args) {
        User r = new User();

        r.getUserId();                  //
        r.setUserName("Vipin");
        r.getAddress();
        r.getAge();
        r.setPassword("4569");
//        r.setDateOfBirth();

        System.out.println("User Id:- " +r.getUserId()+" "+"User Name :-" +r.getUserName());
        System.out.println("User Address " +r.getAddress());
        System.out.println("User Age " +r.getAge());
        System.out.println(r.getPassword());








    }
}
