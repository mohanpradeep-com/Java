package day5;
import java.util.*;
public class strong_no_by_fuctions
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a numbner: ");
        int num = s.nextInt();
        if(isStrong(num))
        {
            System.out.print("The number is strong number");
        }
        else
        {
            System.out.print("The number is not strong number");
        }
    }
    public static boolean isStrong(int num)
    {
        int sum = 0;
        int temp=num;
        while(num!=0)
        {
            int pop = num%10;
            sum += fact(pop);
            num/=10;
        }
        return sum == temp;
    }
    public static int fact(int f)
    {
        int fact =1;
        for(int i =0; i<=f;i++)
        {
            fact *=i;
        }
        return fact;
    }
}