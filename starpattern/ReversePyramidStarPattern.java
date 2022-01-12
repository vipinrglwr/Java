package starpattern;

public class ReversePyramidStarPattern {
    public static void main(String[] args) {
        int i,j,row=6;

    for(i=6;i>=0;i--){
        for (j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    }
}
