
import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        System.out.print("Enter Number Of Rows : ");
        Scanner sc = new Scanner(System.in);
        int Rows = sc.nextInt();
        System.out.println("Number Pyramid which Has " + Rows + " Rows");
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");
            }
            // System.out.println();
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        sc.close();
    }
}
