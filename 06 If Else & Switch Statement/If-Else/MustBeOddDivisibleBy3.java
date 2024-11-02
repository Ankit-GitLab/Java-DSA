import java.util.*;

public class MustBeOddDivisibleBy3 {
    
    public static void main(String[] args) {
        System.out.print("Enter a odd number : ");
        Scanner sc = new Scanner(System.in);
        int Value = sc.nextInt();
        if (Value % 2 == 0 && Value % 3 == 0) {
            System.out.print("Found answer - " + Value);
        }
        sc.close();
    }
}
