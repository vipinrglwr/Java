package operators;

public class Arithmetic {
    static int a=10,b=5;

    public static void main(String[] args) {

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        //Shift Operators
        System.out.println("Shift Operators");
        System.out.println(10>>5);
        System.out.println(10<<5);
        System.out.println(10>>>5);//DT

        //Relational Operators

        //        System.out.println(b instanceof a); //instance of DT
        // a=10 b=5
        System.out.println("Realtional Operators");
        System.out.println(a>b);
        System.out.println(b<a);
        System.out.println(b<=a);
        System.out.println(b>=a);
        System.out.println(b==a);
        System.out.println(b!=a);

//        Arithmetic a = new Arithmetic();
//        System.out.println(a instanceof Arithmetic);

        //Bitwise Operator
        // a=10 b=5
        System.out.println("Bitwise Operator");
        System.out.println(a++>b & b>=a);

        if(a<b & a>=b){
            System.out.println(" A is Greater");
        }else {
            System.out.println("A is smaller");
        }

        boolean b =false,c=true;

        System.out.println(b^c);

        System.out.println(b | c);

        //Logical && ||

        System.out.println(b && c);
        System.out.println(b || c);

        if(b && c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
//Ternary Operator
        int g=4,h=7;
        int data=(g>h)?g:h;
        System.out.println("New");
        System.out.println(data);

        //Differenece between logical(&&) and bitwise Operator

    int p=7,r=8,n=9;

        System.out.println(r<p && n>++r);
        System.out.println(r);

        System.out.println(r<p & n>++r);
        System.out.println(r);

        //Assignment Operator


        System.out.println("Assignmet Operator");
        n+=8; //DT
        System.out.println("Addition"+n);

        n-=8; //DT
        System.out.println("Substraction"+n);

        p*=8;
        System.out.println("Multiplication"+p);//56
        p/=8;
        System.out.println("Divion"+p);//0
        p%=8;
        System.out.println("Exponention"+p);
        p&=8;
        System.out.println("Bitwise And"+p);
        p^=8;
        System.out.println("Bitwise XOR"+p);//true
        p|=8;
        System.out.println("bitwise OR"+p);//true
        p<<=8;
        System.out.println("Shift Operator Left"+p);//36
        p>>=8;
        System.out.println("Shift Operator Right"+p);//0.02

        p>>>=8;
        System.out.println(p);//0.02






    }
}
