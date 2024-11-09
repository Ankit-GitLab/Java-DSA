import java.util.*;

public class sumTheGivenNumber {
    public static void main(String[] args){
        System.out.print("enter A Number Which One You Get The Sum : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oringalNum = num;
        int sumOfDigit = 0;
        while(num > 0){
            sumOfDigit += num % 10;
            num = num / 10;
        }
        System.out.print("sum Of " + oringalNum + " Number Is : " + sumOfDigit);
        sc.close();
     }
}
