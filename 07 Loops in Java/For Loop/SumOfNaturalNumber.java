import java.util.*;

public class SumOfNaturalNumber {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("The sum of natural number is : ");

        int Sum = 0;
        for (int num = 1; num <= n; num++) {
            Sum += num;

        }
        System.out.print(Sum);
        sc.close();
    }
}
