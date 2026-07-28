package day07;
import java.util.*;
public class array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] id=new int[5];
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            id [i]=a;
        }for(int num:id){
            System.out.println(num);
        }
    }
}