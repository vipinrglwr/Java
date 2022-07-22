package practice.string;

public class VowelsFinder {

    public static void main(String[] args) {
//        String str = new String("too fast too furious");
        String str = "furious";


        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
                System.out.print(str.charAt(i));
            }
        }
    }

}
