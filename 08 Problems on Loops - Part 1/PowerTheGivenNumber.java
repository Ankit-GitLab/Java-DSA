import java.util.*;

public class PowerTheGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Base  = ");
        int Base = sc.nextInt();
        System.out.print("Enter the number of Exponent = ");
        int Exponent = sc.nextInt();
        int Power = 1;
        for (int i = 1; i <= Exponent; i++) {
            Power *= Base;
        }
        System.out.println("Base of " + Base + " Exponent of " + Exponent + " Power is = " + Power);
        sc.close();
    }

}
