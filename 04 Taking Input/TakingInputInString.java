
import java.util.Scanner;

public class TakingInputInString {
   
    public static void main(String[] args){
    
      Scanner sc =  new Scanner(System.in);
      
      System.out.print("Enter your name : ");
      String name = sc.nextLine();
      System.out.println("your Name is : " +name);

      sc.close();
    }
    
}