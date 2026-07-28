package day10;

public class split
{
    public static void main(String[]args)
    {
        String str = "apple,banana,orange";
        String [] fruits = str.split(",");
        for (String fruit : fruits )
        {
            System.out.println(fruit);
        }
    }
}