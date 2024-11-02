import java.util.*;

public class NumberHollowRetangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int Rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int Columns = sc.nextInt();
        System.out.println(" The  Number Of Hollow Rectangular which Has " + Rows + " Rows and " + Columns + " Columns");
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Columns; j++) {
                if (i == 1 || i == Rows || j == 1 || j == Columns) {
                    System.out.print(j );
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}