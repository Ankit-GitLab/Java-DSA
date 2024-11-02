import java.util.*;

public class TakingInputInInt {
    
    public static void main(String[] args){
      Scanner sc =  new Scanner(System.in); 

      System.out.println("Enter your lucky number");
      int num_1 = sc.nextInt();

      System.out.println("Lucky Number is : " + num_1);
      sc.close();
      System.out.println("End of program");
      
    }
    
} 
