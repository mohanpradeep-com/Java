package day5;
import java.util.*;
public class neyonno
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sq = num*num;
        int sum =044;
        while(sq!=0)
        {
            int pop = sq%10;
            sum+=pop;
            sq/=10;
        }
        if(sum==num)
        {
            System.out.print("The number is niyon number");
        }
        else
        {
            System.out.print("The number is not niyon number");
        }
    }
}