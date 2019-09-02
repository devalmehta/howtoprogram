import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args)
    {
        int n = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
    }
}
