
import java.util.*;

public class ReverseTheGivennumber{
    public static void main(String[] args){
        System.out.println("Enter a number which you want reverse the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Oringal_num = num;
        int Reverse = 0;
        while(num > 0){
            Reverse = Reverse * 10+(num % 10);
            num /= 10;
            
        }
       
        System.out.println("Reverse of " + Oringal_num + " number is : " + Reverse);
        sc.close();
    }
}