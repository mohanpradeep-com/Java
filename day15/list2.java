package day15;
import java.util.Arrays;
import java.util.List;

public class list2 {
    public static void main(String[] args){
        List<String> name=Arrays.asList("Stalin");
        name.set(0,"sukuna");
        System.out.println(name);
    }
}