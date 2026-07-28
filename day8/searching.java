package day08;
import java.util.Scanner;
public class searching {
    public static void main(String[]args)

    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();
        for (int i = 0;i < n ;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(linear_search(arr, target));
    }
    static int linear_search (int[] arr, int target){
        for(int i=0;i<arr.length; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}