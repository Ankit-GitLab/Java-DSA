import java.util.*;

public class numberPattern {
    public static void main(String[] args) {
        System.out.print("enter Number Of Rows : ");
        Scanner sc = new Scanner(System.in);
        int Rows = sc.nextInt();
        System.out.print("enter Number Of Columns : ");
        int Columns = sc.nextInt();
        System.out.println(" number Pattern Which Has " + Rows + " Rows And " + Columns + " Columns");
        for(int i=1; i<=Rows; i++){
            for(int j=1;j<=Columns; j++){
                System.out.print(j+" ");

            }
                System.out.println( );
        }
        sc.close();
    }
}