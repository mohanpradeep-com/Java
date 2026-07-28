package day5;

import java.util.Scanner;
public class sum_of_odd_even{
    static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int sum=0;
        int evensum=0;
        int oddsum=0;

        while(num!=0) {
            int pop = num % 10;
            if (pop % 2 == 0) {
                evensum += pop;
            } else {
                oddsum += pop;

            }
            sum += pop;
            num = num / 10;
        }
        System.out.println(sum);
        System.out.println(oddsum);
        System.out.println(evensum);



    }
}


