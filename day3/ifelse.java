package day3;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b){
            System.out.println("true");
        }
        else if(a<b){
            System.out.println("false");

        }
        else{
            System.out.println("no");
        }
    }
}