import java.util.*;

public class factorialTheGivenNumber {
    public static void main(String[] args) {
        System.out.print("enter A Number Which you Want A Factorial : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Product = 1;
        for (int i = 1; i <= num; i++) {
            Product *= i;
            System.out.println("factorial Number Of " + i + " Is : " + Product);
        }

        sc.close();
    }
}
