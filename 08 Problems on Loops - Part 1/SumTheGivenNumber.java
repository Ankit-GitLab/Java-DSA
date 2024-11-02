import java.util.*;

public class SumTheGivenNumber {
    public static void main(String[] args){
        System.out.println("Enter a number which one you sum the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Oringal_num = num;
        int SumOfDigit = 0;
        while(num > 0){
            SumOfDigit += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of " + Oringal_num + " number is : " + SumOfDigit);
        sc.close();
     }
}
