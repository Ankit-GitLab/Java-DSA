import java.util.*;

public class AgeGroup {
    public static void main(String[] args) {
        System.out.print("Enter your Age :");
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();

        if (Age <= 12) {
            System.out.println(Age + " Age is Child");
        } 
        else if (Age > 12 && Age < 18) {
            System.out.println(Age + " Age is Teenager");
        }
        else {
            System.out.println(Age + " Age is Adult");
        }
        sc.close();
    }
}
