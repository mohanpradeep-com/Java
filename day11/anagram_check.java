package Day11;

import java.util.Arrays;

public class anagram_check {
    public static void main(String[] args){
        String name="listen";
        String name2="slient";
        if(name.length()!=name2.length()){
            System.out.println("Not an Anagram");
        }
        char [] a=name.toCharArray();
        char [] b=name2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}