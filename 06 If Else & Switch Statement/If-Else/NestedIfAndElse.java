import java.util.*;

public class NestedIfAndElse {
   public static void main(String[] args) {
      System.out.print("Enter your Age : ");
      Scanner sc = new Scanner(System.in);
      int Age = sc.nextInt();
      if (Age <= 12) {
         if (Age <= 5) {
            System.out.print(Age + " Age is Toddler");
         } else {
            System.out.print(Age + " Age is Child");
         }

      }
      sc.close();
   }
}
