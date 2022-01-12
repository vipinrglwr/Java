public class NewStatic {
    static int i =10;

    void display(){
        int j =10;
        System.out.println("i ="+i+"&"+"j="+j);
        ++i; //memory is allocatted when application is running thats why value of i is increamenting
        ++j;
    }

    public static void main(String[] args) {
        NewStatic newstatic =new NewStatic();
        newstatic.display();
        newstatic.display();
    }
}
