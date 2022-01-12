package arrays;

public class MissingNumber {
    public static int findNumber(int[] numb){
        int no=numb.length;
        int sum =((no+1)*(no+2))/2;
        for(int i=0;i<no;i++)
            sum-= numb[i];
        return sum;
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,6};
        System.out.println(findNumber(a));
    }
}
