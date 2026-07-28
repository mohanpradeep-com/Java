package day5;
import java.util.*;
public class harishthno
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = s.nextInt();

        int sum = 0;
        while(num!=0)
        {
            int pop = num%10;
            sum = sum+pop;
            num/=10;
        }
        if(num%sum==0)
        {
            System.out.print("Hairsth number");
        }
        else
        {
            System.out.print("Not hairsth number");
        }

    }
}