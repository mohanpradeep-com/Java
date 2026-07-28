package day7;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] id={9,6,78,6,7,5,4,-4,90};
        int max = id[0];
        int min = id[0];
        for(int num:id){
            if(num>max){
                max=num;
            }
            else if(num<min){
                min=num;
            }
        }
        System.out.println(max);
        System.out.println(min);



    }
}
