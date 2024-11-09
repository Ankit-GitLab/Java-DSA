import java.util.*;

public class powerTheGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter The Number Of Base : ");
        int base = sc.nextInt();
        System.out.print("enter The Number Of Exponent : ");
        int exponent = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power *= base;
        }
        System.out.print("base Of " + base + " Exponent Of " + exponent + " Power Is : " + power);
        sc.close();
    }

}
