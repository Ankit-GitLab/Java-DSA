import java.util.*;

public class RectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows Numbers : ");
        int Rows = sc.nextInt();
        System.out.print("Enter Columns Numbers : ");
        int Columns = sc.nextInt();
        System.out.println(" The Rectangular which has " + Rows + " Rows and " + Columns + " Columns");
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}