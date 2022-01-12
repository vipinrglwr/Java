package starpattern;

public class MirroredRightTriangleStarPattern {
    public static void main(String[] args) {
        int i,j,k,rows=5;

        for (i=0;i<=rows;i++){
            for (j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
