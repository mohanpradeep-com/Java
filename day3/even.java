package day3;
import java.util.Scanner;

public class even {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String r=(a%2==0)?"even":"odd";
        System.out.println(r);
    }
}