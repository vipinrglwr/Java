package typesofrelatioship.egvehicle.egcollege;

class Lab {
    private String SubLab;
    private Professer professer;
    private Student student;

    void lab(){
        System.out.println("Practical");
    }

    public String getSubLab() {
        return SubLab;
    }

    public void setSubLab(String subLab) {
        SubLab = subLab;
    }

    public Professer getProfesser() {
        return professer;
    }

    public void setProfesser(Professer professer) {
        this.professer = professer;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
