
import java.util.*;

public class PrintNTo1 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The number is print N to 1 :");

        for (int num = n; num >= 1; num--) {
            System.out.println(num);
        }
    }
}
