package typesofrelatioship.egvehicle.egcollege;

class Department extends College {
    private String work;
    private Professer professer;
    private Lab lab;
    private Student student;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Professer getProfesser() {
        return professer;
    }

    public void setProfesser(Professer professer) {
        this.professer = professer;
    }

    public Lab getLab() {
        return lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
