package starpattern;

public class SandglassStarPattern {
    public static void main(String[] args) {
        int i, j, k, row = 5;

        for (i = 0; i <= row-1; i++)
        {
            for (j = 0; j<i; j++) //DT
            {
                System.out.print(" ");
            }
            for (k = i; k <= row - 1; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (i=row-1;i >= 0; i--)
        {
            for (j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (k = i; k <= row - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
