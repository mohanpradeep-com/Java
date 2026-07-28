 package day7;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args){
        Scanner vs = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0;
        int evenSum=0;
        for(int i=0;i<5;i++){
            arr[i]=vs.nextInt();
            sum=sum+arr[i];
            if(arr[i]%2==0){
                evenSum=evenSum+arr[i];
            }
        }
        System.out.println("Sum of all Elements: "+sum);
        System.out.println("Sum of even Elements: "+evenSum);

    }
}

