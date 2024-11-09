
import java.util.*;

public class rectangularPattern1Or2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Rows Numbers : ");
        int Rows = sc.nextInt();
        System.out.print("enter Columns Numbers : ");
        int Columns = sc.nextInt();
        System.out.println(" the Rectangular Which Has " + Rows + " Rows And " + Columns + " Columns");
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Columns; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(2+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}