import java.util.*;

public class countTheGivenNumber {
    public static void main(String[] args) {
        System.out.print("enter A Number Which One You Count The Digit : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int numberOfDigit = 0;
        while (num > 0) {
            num /= 10;
            numberOfDigit++;
        }
        System.out.print("number Of Digit In " + originalNum + " In Digit Is : " + numberOfDigit);
        sc.close();
    }
}