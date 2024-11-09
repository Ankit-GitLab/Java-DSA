
import java.util.*;

public class StreamOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int Sum = 0;
       
        while (num != -1) {
            Sum += num;

            num = sc.nextInt();
        }
        System.out.print("The Sum Of All Number Is : " + Sum);
       
        sc.close();
    }
}