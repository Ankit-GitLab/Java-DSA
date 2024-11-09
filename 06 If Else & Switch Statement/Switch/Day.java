import java.util.*;

public class Day {
    public static void main(String[] args) {
        System.out.print("Enter a number to check day : ");
        Scanner sc = new Scanner(System.in);
        int Day = sc.nextInt();

        switch (Day) {
            case 1:
                System.out.print(Day + " is MONDAY");
                break;
            case 2:
                System.out.print(Day + " is TUESDAY");
                break;
            case 3:
                System.out.print(Day + " is WEDNESDAY");
                break;
            case 4:
                System.out.print(Day + " is THURSDAY");
                break;
            case 5:
                System.out.print(Day + " is FRIDAY");
                break;
            case 6:
                System.out.print(Day + " is SATURDAY");
                break;
            case 7:
                System.out.print(Day + " is SUNDAY");
                break;
            default:
                System.out.print(Day + " is Invalide Day Number");
        }
        sc.close();
    }
}
