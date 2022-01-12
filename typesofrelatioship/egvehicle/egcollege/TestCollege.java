package typesofrelatioship.egvehicle.egcollege;

public class TestCollege{
    public static void main(String[] args) {
   College college =new College();
        college.setName("St.Sarvoday");

        Address address =new Address();
        address.setPinCode(441222);
        address.setLandmark("Jaiswal");
        address.setLandmark("Kalpataru");
        address.setCity("new Sindewahi");

        Student student=new Student();
        student.setRollno(21);
        student.setName("foxin");
        student.setSecName("c");
        student.setAddress(address);

        Professer professer =new Professer();
        professer.setProfSub("English");
        professer.setProfName("jack");
        professer.setProfPost("AsA");
        professer.setAddress(address);

        Lab lab=new Lab();
        lab.setSubLab("chemistry");
        lab.setProfesser(professer);
        lab.setStudent(student);

        Department department=new Department();
        department.setWork("No");
        department.setProfesser(professer);
        department.setLab(lab);
        department.setStudent(student);
    }
}
