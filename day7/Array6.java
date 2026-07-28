package day7;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args){
        Scanner v = new Scanner(System.in);
        int[] id = {4,3,5,6,8,9};
        int evensum=0;
        int oddsum=0;
        for(int num:id){
            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}