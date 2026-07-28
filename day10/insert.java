package day10;

public class insert
{
    public static void main(String[]args)
    {
        StringBuilder name = new StringBuilder("hello");
        name.append(" world");
        name.insert(6,"and ");
        System.out.print(name);
    }
}