package day5;
import java.util.*;
public class sumof1andlastdigit
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int rev = 0;
        int last_digit= num%10;
        while(num!=0)
        {
            int pop = num%10;
            rev = rev*10+pop;
            num/=10;
        }
        int first_digit = rev%10;
        int sum = first_digit+last_digit;
        System.out.print(sum);
    }
}