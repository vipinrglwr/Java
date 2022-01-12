package starpattern;

public class Asd {

    public static void main(String[] args) {
        int row =5;

        for(int i=0;i<row;i++)
        {
            for(int k=i;k<=row;k++)
                System.out.print(" ");

            for(int j=0;j<=2*i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
