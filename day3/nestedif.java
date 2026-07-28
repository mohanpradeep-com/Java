package day3;

import java.util.Scanner;


public class nestedif {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%3==0)
        {
            if(a%5==0){
                System.out.println("true");
            }
        }
    }
}