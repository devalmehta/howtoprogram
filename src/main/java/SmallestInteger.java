import java.util.Arrays;
import java.util.Scanner;

public class SmallestInteger {
    public static void main(String[] args) {
        System.out.println("Enter the number of integers to enter :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        int j = n;
        while(n > 0){
            System.out.println("Enter " + (j - (n-1)) + " element :");
            array[n-1] = in.nextInt();
            n--;
        }
        Arrays.sort(array);
        System.out.println("Smallest element is :" +array[0]);
    }
}
