package OOPS_Day_1;
class Car{
    private String model;
    private int year;
    public Car(){
        this.model="unknown";
        this.year=2026;
    }
}
public class No_argument_constructor {
    public static void main(String[] args){
        B person1=new B(20,"sukunaa",100);
        B person2=new B(21,"sukunaa",101);
        person1.display();
        person2.display();
    }
}