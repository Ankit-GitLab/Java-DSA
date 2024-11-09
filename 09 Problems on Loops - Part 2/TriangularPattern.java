import java.util.*;

public class triangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Number Of Rows : ");
        int Rows = sc.nextInt();

        System.out.println(" the Triangle Which Is " + Rows + " Rows ");
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
