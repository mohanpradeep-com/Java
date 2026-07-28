package day08;

public class searchin02 {
    public static void main(String[] args) {

        String name = "hello world";
        char[] name1 = name.toCharArray();
        char target = 'd';

        if (ls(name1, target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    public static boolean ls(char[] arr, char target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }
}