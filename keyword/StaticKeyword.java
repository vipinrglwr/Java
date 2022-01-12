package keyword;

public class StaticKeyword {
    private int empId;
    private String eName;
    static private String cname="CodeKul";

    public StaticKeyword(int empId, String eName) {
        this.empId = empId;
        this.eName = eName;
    }

    void show(){
        System.out.println("Company ID:- "+empId+"Employee Name:-"+eName+"Company NAME :-"+cname);
    }

    public static void main(String[] args) {
        StaticKeyword emp1 =new StaticKeyword(1,"emp1");
        StaticKeyword emp2 =new StaticKeyword(2,"emp2");
        StaticKeyword emp3 =new StaticKeyword(3,"emp3");
//        StaticKeyword.cname="Facebook";
        emp1.show();
        emp2.show();
        emp3.show();
    }
}
