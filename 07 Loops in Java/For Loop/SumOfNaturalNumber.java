import java.util.*;

public class SumOfNaturalNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The sum of natural number is :");

        int Sum = 0;
        for (int num = 1; num <= n; num++) {
            Sum += num;

        }
        System.out.println(Sum);
    }
}
