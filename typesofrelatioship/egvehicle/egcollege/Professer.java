package typesofrelatioship.egvehicle.egcollege;

public class Professer {
    private String profName;
    private String profSub;
    private String profPost;
    private Address address;

    void teach(){
        System.out.println("Teaching");
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfSub() {
        return profSub;
    }

    public void setProfSub(String profSub) {
        this.profSub = profSub;
    }

    public String getProfPost() {
        return profPost;
    }

    public void setProfPost(String profPost) {
        this.profPost = profPost;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
