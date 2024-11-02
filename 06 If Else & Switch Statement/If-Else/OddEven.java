import java.util.*;

public class OddEven {

    public static void main(String[] args) {
        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("even : " + num);
        } else {
            System.out.println("odd : " + num);
        }
        sc.close();
    }
}
