package controlstatement.prcontrolstatement;

public class Min {
    public static void main(String[] args) {
        int x =7;
        int y= 18;
        int z =5;

        if(y<x && y<z ){
            System.out.println("Y is Smaller");
        }else{
            if(x<y && x<z){
                System.out.println("X is smaller");
            }else{
                System.out.println("Z is smaller");
            }
        }
    }
}
