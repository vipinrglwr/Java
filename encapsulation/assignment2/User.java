package encapsulation.assignment2;

public class User{
    private int UserId =584625;
    private String UserName= "CodeKul#9078";
    private String Address ="Pune";
    private String Password ="Password";
    private int Age =23;
    private float DateOfBirth =15/07/1998;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return Age;
    }

    public void setDateOfBirth(float dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}
