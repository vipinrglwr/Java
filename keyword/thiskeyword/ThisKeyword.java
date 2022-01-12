package keyword.thiskeyword;

public class ThisKeyword {
//For instatane Variable
    int id;
    String name;
    String city;

    ThisKeyword(int id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }

    void Display(){
        System.out.println("ID:-"+id+"Name"+name+"city:-"+city);
    }


    public static void main(String[] args) {
        ThisKeyword data= new ThisKeyword(1,"John","nagpur");
        ThisKeyword store= new ThisKeyword(2,"peter", "Amsterdam");
        data.Display();
        store.Display();

    }



}
