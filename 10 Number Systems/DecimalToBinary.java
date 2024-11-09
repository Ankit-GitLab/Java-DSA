import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter The Decimal Number To Convert Binary : ");
        int decimalNum = sc.nextInt();
        int answer = 0; // binary Number

        int PW = 1; // power Of 10

        while (decimalNum > 0) {
            int parity = decimalNum % 2;
            answer += (parity * PW);
            PW *= 10;
            decimalNum /= 2;
        }
        System.out.print("your Binary Number Is : " + answer);
        sc.close();
    }
}
