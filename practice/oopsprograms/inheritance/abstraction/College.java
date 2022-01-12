package practice.oopsprograms.inheritance.abstraction;

abstract class College {
    College(){
        System.out.println("College is created");
    }

    abstract int noOfStudent();

    void collegeName(){
        System.out.println("P.R.M.I.T");
    }

}
