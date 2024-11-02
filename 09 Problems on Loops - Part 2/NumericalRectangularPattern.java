
import java.util.*;

public class NumericalRectangularPattern {
    public static void main(String[] args) {
        System.out.print("Enter Number Of Rows :");
        Scanner sc = new Scanner(System.in);
        int Rows = sc.nextInt();
        System.out.println(" Numerical Rectangle Which Has " + Rows + " Rows ");
        for(int i=1; i<=Rows; i++){
            for(int j=i;j<=Rows; j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}