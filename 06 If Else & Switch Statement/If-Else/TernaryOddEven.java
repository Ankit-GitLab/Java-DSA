import java.util.*;

public class TernaryOddEven {
  public static void main(String[] args) {
    System.out.print("Enter a number to check odd or even : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String Ans;
    Ans = (num % 2 == 0) ? "Even" : "Odd";
    System.out.println(Ans);
    sc.close();
  }
}
