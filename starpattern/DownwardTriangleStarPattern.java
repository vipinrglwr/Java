package starpattern;

public class DownwardTriangleStarPattern {
    public static void main(String[] args) {

       int row=7;

       for(int i=row-1;i>=0;i--){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println(" ");
       }

    }
}
