package day10;

public class problem
{
    public static void main(String[]args)
    {
        String name = "luffy";
        char [] arr = name.toCharArray();
        int Start =0,End=arr.length-1;
        while(Start<=End)
        {
            char temp = arr[Start];
            arr[Start]=arr[End];
            arr[End]=temp;
            Start++;
            End--;
        }
        String s = new String(arr);
        System.out.print(arr);
    }
}