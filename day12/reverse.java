package Day12;
import java.util.*;
class rev{

    int rev(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        int a=sc.nextInt();
        int reverse=0;
        while(a!=0){
            int pop=a%10;
            reverse=reverse*10+pop;
            a/=10;
        }
        return reverse;
    }

}
public class reverse {
    public static void main(String[]args){
        rev obj1=new rev();
        System.out.println(obj1.rev());

    }
}