import java.util.*;

public class SumOfSeriesTheGivenNumber {
    public static void main(String[] args){
        System.out.println("Enter a number to sum of Series number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Sum = 0;
        for(int i=1; i<=num; i++){
            if(i%2==0){
                Sum -= i;
            }
            else{
                Sum += i;
            }
        }
        
        System.out.println("Sum of series " + num + " is : " + Sum);
        sc.close();
     }
    
}
