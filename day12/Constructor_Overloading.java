package OOPS_Day_1;
class a{
    int id;
    String name;
    String name1;
    a(int id){
        this.id=id;
    }
    a(String name){
        this.name=name;
    }
    a(String name1,String name2){
        this.name1=name1;
        this.name=name2;
    }
    a(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args){
        a obj=new a(10);
        a obj1=new a(10,"kkk");
        a obj2=new a("kkk","sss");
    }
}