import java.util.*;

public class starPyramid {
    public static void main(String[] args) {
        System.out.print("enter Number Of Rows : ");
        Scanner sc = new Scanner(System.in);
        int Rows = sc.nextInt();
        System.out.println(" star Pyramid Which Has " + Rows + " Rows ");
        for (int i = 0; i <= Rows; i++) {
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print("  ");
            }
            // System.out.println();
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
