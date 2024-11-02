import java.util.*;

public class DivisibleBy3OR5 {
    public static void main(String[] args) {
        System.out.print("Enter a number to check divisible by 3 Or 5 : ");
        Scanner sc = new Scanner(System.in);
        int Value = sc.nextInt();
        if (Value % 5 == 0 && Value % 3 == 0) {
            System.out.println(Value + " is divisible by 3 and 5");
        } 
        else if (Value % 5 == 0){
            System.out.println(Value + " is divisible by 5");
        }
        else if (Value % 3 == 0){
            System.out.println(Value + " is divisible by 3");
        }
        else {
            System.out.println(Value + " is invalid value");
        }
            sc.close();
    }
}
