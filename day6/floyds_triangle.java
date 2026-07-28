package day6;

public class floyds_triangle {
    public static void main(String[] args) {

        int n = 5;
       //int num=i;
        for (int i = 1; i <= n; i++) {
            int num=i;
            for (int j = 1; j <= n; j++) {
                System.out.print(num+" ");
                num=num+n;


            }
            System.out.println();
        }
    }
}