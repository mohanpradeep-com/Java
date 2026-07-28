class A{
    void display(){
        System.out.println("hellooo");
    }
}
class B extends A{
    void show(){
        System.out.println("welcomeee");
    }
}
class C extends A{
    void fly(){
        System.out.println("heyyyy");
    }
}
public class Multiple_inheritance {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        C c=new C();
        b.show();
        b.display();
        c.fly();
        c.display();
    }
}