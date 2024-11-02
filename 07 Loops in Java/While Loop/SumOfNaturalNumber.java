
import java.util.*;

public class SumOfNaturalNumber {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = 1;
        int Sum = 0;
        System.out.println("The sum of natural number is ");
        while (num <= n) {
            Sum += num;

            num++;
        }
        System.out.println(Sum);
    }
}