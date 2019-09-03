import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(isPrimeNumber(number));
    }

    private static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for(int i =2; i<=9; i++) {
            if(number %i ==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
