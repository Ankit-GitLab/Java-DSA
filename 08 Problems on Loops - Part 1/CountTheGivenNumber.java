import java.util.*;

public class CountTheGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number which one you count the digit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original_num = num;
        int NumberOfDigit = 0;
        while (num > 0) {
            num /= 10;
            NumberOfDigit++;
        }
        System.out.println("Number of digit in " + original_num + " is :" + NumberOfDigit);
        sc.close();
    }
}