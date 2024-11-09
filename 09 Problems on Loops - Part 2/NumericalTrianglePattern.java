import java.util.*;

public class numericalTrianglePattern {
    public static void main(String[] args) {
        System.out.print("enter Number Of Rows : ");
        Scanner sc = new Scanner(System.in);
        int Rows = sc.nextInt();
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
