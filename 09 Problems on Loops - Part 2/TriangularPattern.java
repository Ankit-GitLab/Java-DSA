import java.util.*;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int Rows = sc.nextInt();

        System.out.println(" The Triangle which is " + Rows + " Rows ");
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
