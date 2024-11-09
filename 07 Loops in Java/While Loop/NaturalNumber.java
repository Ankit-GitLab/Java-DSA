import java.util.*;

public class NaturalNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int num = 1;
        System.out.print("The natural number is : ");
        while (num <= n) {
            System.out.print(num+" ");
            num++;
        }
        sc.close();
    }
}