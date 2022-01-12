package practice.oopsprograms.inheritance.encapsulation;

public class TestUsername {
    public static void main(String[] args) {
        Username user =new Username();
        user.getName();
        user.getId();
        user.getCity();
        user.setName("nandini dode");
        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.getCity());

    }
}
