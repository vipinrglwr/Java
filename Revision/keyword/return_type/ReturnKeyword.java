package Revision.keyword.return_type;

public class ReturnKeyword {

    public int a(){
        int sum = 5+9;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        ReturnKeyword returnKeyword = new ReturnKeyword();
        returnKeyword.a();
    }

}
