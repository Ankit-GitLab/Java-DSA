
import java.util.*;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate the sum of natural number : ");
        int n = sc.nextInt();
        int num = 1;
        int Sum = 0;
        System.out.print("The sum of natural number is : ");
        while (num <= n) {
            Sum += num;

            num++;
        }
        System.out.print(Sum);
        sc.close();
    }
}