import java.util.Scanner;

public class longest_word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String longword=words[0];
        for(String s:words){
            if(s.length()>longword.length()){
                longword=s;
            }
        }
        System.out.println(longword);
    }
}