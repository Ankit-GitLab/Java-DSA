import java.util.*;

public class OddEven {

    public static void main(String[] args) {
        System.out.print("Enter a number to check ood even = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        sc.close();
    }
}
