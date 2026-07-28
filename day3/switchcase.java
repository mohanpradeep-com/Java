package day3;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        switch(a){
            case 1:
                if(a<5){
                    System.out.println("bye");
                }
                else{
                    System.out.println("good ");
                }
                break;
            case 2:
                System.out.println("hello");
                break;


        }
    }
}