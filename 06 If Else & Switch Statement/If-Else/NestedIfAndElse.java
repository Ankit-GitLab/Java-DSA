import java.util.*;

public class NestedIfAndElse {
   @SuppressWarnings("resource")
public static void main(String[] args) {
      System.out.println("Enter your Age : ");
      Scanner sc = new Scanner(System.in);
      int Age = sc.nextInt();
      if (Age <= 12) {
         if (Age <= 5) {
            System.out.println(Age + " Age is Toddler");
         } else {
            System.out.println(Age + " Age is Child");
         }

      }
   }
}
