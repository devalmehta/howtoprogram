import java.util.Scanner;

public class ConvertBinaryToDecimal {

    public static void main(String[] args) {
        System.out.println("Enter a binary number :");
        Scanner in = new Scanner(System.in);
        String binaryNumber = in.nextLine();
        char[] binaryArray = binaryNumber.toCharArray();
        double decimal = 0;

        double length = binaryArray.length;
        for(char c : binaryArray) {
            decimal = decimal + (c * Math.pow(2.0,length));
            length = length -1;
        }
        System.out.println(decimal);
    }
}
