import java.util.Scanner;

public class OddorEven {

    public static void main (String[] args) {
        System.out.println("Enter the value to determine if odd or even :");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        switch( value %2) {
            case 0 :
                System.out.println("Even Integer");
                break;
            default:
                System.out.println("Odd Integer");
                break;
        }
    }
}
