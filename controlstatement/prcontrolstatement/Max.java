package controlstatement.prcontrolstatement;

public class Max {
    public static void main(String[] args) {
        int a= 5;
        int b= 10;
        int c= 15;

        if(a>b && a>c){
            System.out.println("A Is Greater");
        }else{
            if(b<a && b>c){
                System.out.println("B Is Greater");
            }else{
                System.out.println("C Is Greater");
            }
        }
    }
}
