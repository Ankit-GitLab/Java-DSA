
import java.util.*;

public class PrintNTo1 {
    public static void main(String[] args) {

        System.out.print("Enter a number to print N to 1 : ");
        
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("The Answer Is  : ");

        for (int num = n; num >= 1; num--) {
            System.out.print(num+" ");
        }
        sc.close();
    }
}
