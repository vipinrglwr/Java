package loop.startpattern;

abstract class Rectangle extends Scan{
   private int length=0;
   private int breath=0;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    int DisplayData(){
        return this.length*this.breath;

    }


}
