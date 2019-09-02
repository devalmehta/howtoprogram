import java.util.Scanner;

public class CompoundingInterest {
    public static void main(String[] args) {
        System.out.println("Enter the principle amount : ");
        Scanner in = new Scanner(System.in);
        int principleAmount = in.nextInt();
        System.out.println("Enter the years to compound :");
        int years = in.nextInt();
        System.out.println("Enter the interest rate :");
        int interest = in.nextInt();
        double finalAmount = principleAmount;
        while (years > 0) {
            double interestAmount = finalAmount * interest /100;
            finalAmount = finalAmount + interestAmount;
            years--;
        }
        System.out.println(finalAmount);
    }
}
