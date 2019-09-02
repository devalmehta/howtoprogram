import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {
        System.out.println("Enter an integer :");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String inputString = Integer.toString(input);
        StringBuilder builder = new StringBuilder(inputString);
        builder.reverse();
        String reverseInputString = builder.toString();
        System.out.println(inputString.equals(reverseInputString));
    }
}
