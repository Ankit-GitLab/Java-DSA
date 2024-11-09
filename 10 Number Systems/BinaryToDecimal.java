import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Binary Number To Convert Decimal : ");
        int binaryNum = sc.nextInt();

        int answer = 0; // converted Decimal Number
        int PW = 1; // 2 ^ 0= 1 power of 2

        while (binaryNum > 0) {
            int unitDigit = binaryNum % 10;
            answer += (unitDigit * PW);
            binaryNum /= 10;
            PW *= 2;
        }
        System.out.print("your Decimal Number Is : ");
        System.out.print(answer);
        sc.close();
    }
}
