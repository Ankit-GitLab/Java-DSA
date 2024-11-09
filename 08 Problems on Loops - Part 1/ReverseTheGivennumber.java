
import java.util.*;

public class reverseTheGivennumber{
    public static void main(String[] args){
        System.out.print("enter A Number Which You Want Reverse The Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oringalNum = num;
        int reverse = 0;
        while(num > 0){
            reverse = reverse * 10+(num % 10);
            num /= 10;
            
        }
       
        System.out.println("reverse Of " + oringalNum + " Number Is : " + reverse);
        sc.close();
    }
}