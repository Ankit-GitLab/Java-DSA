import java.util.*;

public class NaturalNumber {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("The natural number is : ");

        for (int num = 1; num <= n; num++) {
            System.out.print(num+" ");
        }
        sc.close();
    }
}
