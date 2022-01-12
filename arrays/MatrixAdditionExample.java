package arrays;

public class MatrixAdditionExample {
    public static void main(String[] args) {   //DT

        int a[][] ={{2}, {3} ,{5} ,{7}};
        int b[][] ={{4}, {9} ,{8} ,{6}};

        int c[][] =new int[a.length][b.length]; //2rows 2 column
        System.out.println("a.length:"+a.length);
        System.out.println("b.length:"+b.length);
        for(int i=0;i< a.length;i++){
            for(int j=0;j<b.length;j++){
                  System.out.println(a[i][j]);
                  System.out.println(b[i][j]);
             //   c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+"");
            }
            System.out.println();
        }
    }

}
