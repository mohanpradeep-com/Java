package day15;

import java.util.List;
import java.util.ArrayList;
public class add_method {
    public static void main(String[] args){
        List<Integer> list= new ArrayList();
        list.add(1);
        list.add(2);
        list.add(1,20);
        list.set(1,2);
        System.out.println(list);
    }
}