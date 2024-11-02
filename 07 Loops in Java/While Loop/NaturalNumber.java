import java.util.*;

public class NaturalNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = 1;
        System.out.println("The natural number is : ");
        while (num <= n) {
            System.out.println(num);
            num++;
        }

    }
}