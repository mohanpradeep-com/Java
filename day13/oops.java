package day13;
class A{  //super class
    void display(){
        System.out.println("hello world");
    }
}
class B extends A{  //sub class
    void show(){
        System.out.println("welcomeee");
    }
}
public class oops {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        b.show();
        b.display();
    }
}