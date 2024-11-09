
import java.util.*;

public class numericalRectangularPattern {
    public static void main(String[] args) {
        System.out.print("enter Number Of Rows : ");
        Scanner sc = new Scanner(System.in);
        int Rows = sc.nextInt();
        System.out.println("numerical Rectangle Which Has " + Rows + " Rows ");
        for(int i=1; i<=Rows; i++){
            for(int j=i;j<=Rows; j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=i-1; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}