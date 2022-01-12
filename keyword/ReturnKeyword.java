package keyword;

public class ReturnKeyword {
    public int add(int x,int y){

        int z=x+y;
        return z;


    }

    public static void main(String[] args) {
        ReturnKeyword data = new ReturnKeyword();
        int add= data.add(7,5);
        System.out.println("Sum of X & y" + add);
    }
}
