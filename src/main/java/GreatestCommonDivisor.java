import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Enter first number :");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        System.out.println("Enter second number :");
        int n2 = in.nextInt();
        int n = Math.min(n1, n2);
        int gcd = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("Greatest Common Divisor for " + n1 + " and " + n2 + " is "+ gcd);
    }
}
