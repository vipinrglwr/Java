package loop.numberpattern;

public class Even {
    public static void main(String[] args) {
        for (int i=0;i<50;i++){
            for (int j=0;j<1;j++){
                if (i%2==0){
                    System.out.print(i);
                }
            }
        }
    }
}
