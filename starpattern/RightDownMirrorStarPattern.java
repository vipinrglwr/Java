package starpattern;

public class RightDownMirrorStarPattern {
    public static void main(String[] args) {

        int i,j,k,row=6;

        for(i=row;i>=1;i--){
            for(j=row;j>i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
