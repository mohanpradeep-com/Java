package OOPS_Day_1;
class A{
    int age;
    String name;
    void display(){
        System.out.println("display");
    }
}
public class Class {
    public static void main(String[] args){
        A obj=new A();
        obj.display();
    }
}