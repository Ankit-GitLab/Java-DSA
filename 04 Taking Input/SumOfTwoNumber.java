import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your 1st number");
            int num_1 = sc.nextInt();

            System.out.println("Enter your 2nd number");
            int num_2 = sc.nextInt();
            
            int Sum = num_1 + num_2;
            System.out.println("The sum of two number : " + Sum);
            sc.close();
        }
        

    }
}
