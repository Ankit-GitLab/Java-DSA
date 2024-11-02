
import java.util.*;

public class UltaTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int Rows = sc.nextInt();

        System.out.println(" The Triangle which has " + Rows + " Rows ");
        for (int i = 0; i <= Rows; i++) {
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}