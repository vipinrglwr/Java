package loop;

public class FoEach {
    public static void main(String[] args) {

        int[]a ={1,2,3,4,5};


//        for(int i=0;i<a.length;i++){   i is for index 0 to 4
//            System.out.println(i);
//        }

        for(int no :a){
            System.out.println(no);
        }
    }
}
