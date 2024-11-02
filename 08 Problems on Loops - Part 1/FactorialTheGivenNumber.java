import java.util.*;

public class FactorialTheGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number which you Want a factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Product = 1;
        for (int i = 1; i <= num; i++) {
            Product *= i;
            System.out.println("Factorial number of " + i + " is : " + Product);
        }
        
        sc.close();
    }
}
