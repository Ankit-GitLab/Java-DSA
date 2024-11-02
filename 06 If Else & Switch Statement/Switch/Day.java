import java.util.*;

public class Day {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int Day = sc.nextInt();
        
        switch(Day){
            case 1:
            System.out.println("MONDAY"); 
            break; 
            case 2:
            System.out.println("TUESDAY"); 
            break;
            case 3:
            System.out.println("WEDNESDAY"); 
            break;
            case 4:
            System.out.println("THURSDAY"); 
            break;
            case 5:
            System.out.println("FRIDAY"); 
            break;
            case 6:
            System.out.println("SATURDAY"); 
            break;
            case 7:
            System.out.println("SUNDAY"); 
            break;
            default:
            System.out.println("Invalide Day Number");
        }
    }
}
