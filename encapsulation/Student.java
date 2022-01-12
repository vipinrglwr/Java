package encapsulation;

public class Student {
    private int RollNo =21;
    private String StudName = "CodeKul";
    private String Password;

    public void setPassword(String password) {
        this.Password = password;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        this.RollNo = RollNo;
    }

    public String getStudName() {
        return StudName;
    }

    public void setStudName(String studName) {
        this.StudName = studName;
    }
}
