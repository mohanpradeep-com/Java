
package day3;
import java.util.Scanner;

public class calculator {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    String a = s.next();
    switch (a) {
        case "+":
            System.out.println(num1 + num2);
            break;

        case "-":
            System.out.println(num1 - num2);
            break;
        case "*":
            System.out.println(num1 * num2);
            break;
        case "/":
            System.out.println(num1 / num2);
            break;
    }


}
    }