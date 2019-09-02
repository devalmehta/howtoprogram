import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println("Enter number for factorial : ");
        Scanner in = new Scanner(System.in);
        int factorial = in.nextInt();
        System.out.println(factorial(factorial));
        // compute e where e = 1 + 1/1! + 1/2!...
        System.out.println("Value of e is : " + computee(factorial));
    }

    private static double computee(int factorial) {
        double e = 0;
        while (factorial > 0) {
            int facto = factorial(factorial);
            double divideByOne = (double)(1/ facto);
            e = e + divideByOne;
            factorial--;
        }
        return e +1;
    }

    private static int factorial(int factorial) {
        if(factorial > 0){
            return (factorial * factorial(factorial -1));
        }
        return 1;
    }
}
