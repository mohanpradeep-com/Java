package Day12;
class d{
    int age;
    String name;
    d(int age,String name){
        this.age=age;
        this.name=name;
    }
    void  display(){
        System.out.println(age+" "+name);

    }
}

public class this_keyword {
    public static void main(String []args){
        d obj=new d(1,"sukunaa");
        obj.display();

    }
}