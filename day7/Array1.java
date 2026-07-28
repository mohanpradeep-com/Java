package day7;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        Scanner vs = new Scanner(System.in);
        System.out.println("Enter your number:");
        int[] id=new int[5];
        for(int i=0;i<5;i++){
            int a=vs.nextInt();
            id[i]=a;
        }
        System.out.println(id[3]);
    }
}