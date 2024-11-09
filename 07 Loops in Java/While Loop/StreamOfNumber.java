
import java.util.*;

public class StreamOfNumber {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the sum");
        int num = sc.nextInt();

        int Sum = 0;
       
        while (num != -1) {
            Sum += num;

            num = sc.nextInt();
        }
        System.out.print("Here Is You Sum : ");
        System.out.print(Sum+ " ");
        sc.close();
    }
}