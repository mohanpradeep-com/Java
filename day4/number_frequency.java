package day4;

import java.util.Scanner;

public class number_frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            int pop = a % 10;
            if (pop == 0) {

                count++;
            }
            a /= 10;
        }
        System.out.println("The frequency is:" + count);
    }
}