
import java.util.*;

public class DoWhile {

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = 20;
        System.out.println("Your answer is : ");
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}
