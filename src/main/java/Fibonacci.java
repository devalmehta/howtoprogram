import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number up to which you want to generate fibonacci series : ");
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        fibonacci(range);

    }

    private static int fibonacci(int range) {
        int i = 0;
        int n =0;
        System.out.print(0 + " " + 1);
        n++;
        while (n == range) {
            System.out.print(" ");
            System.out.print(n);
        }
        return n + fibonacci(n+1);
    }
}
