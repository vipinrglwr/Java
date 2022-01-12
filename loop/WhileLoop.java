package loop;

public class WhileLoop {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int i=0;
        int sum=0;
        while(i<10){
            sum =sum +a[i];

            i++;
        }
        System.out.println("Sum"+sum);

        }
    }
