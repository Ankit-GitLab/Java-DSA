import java.util.*;

public class NaturalNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The natural number is :");
        
        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }
    }
}
