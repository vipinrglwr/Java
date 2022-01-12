package starpattern;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        int rows =5;
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){            //DT
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
