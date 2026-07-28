package Day13;
class v{
    private int a;
    private int b;
    private String name;
    v(int a,int b,String name){
        this.a=a;
        this.b=b;
        this.name=name;
    }
    void setID(int a, int b,String name){
        this.a=a;
        this.b=b;
    }
    int getA(){
        return this.a;
    }
    int getB(){
        return this.b;
    }
    void display(){
        System.out.println(a+" "+b+" "+" "+name);
    }
}
public class Encapsulation {
    public static void main(String[]args){
        v obj=new v(10,20,"sukunaa");
        obj.display();
    }
}