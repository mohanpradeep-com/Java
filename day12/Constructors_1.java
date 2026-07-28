package OOPS_Day_1;

class C{
    int id;
    String name;
    String name1;
    C(int i,String n){
        id=i;
        name1=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

public class Constructors_1 {
    public static void main(String[] args){
        C a=new C(1,"a");
        a.display();
    }
}