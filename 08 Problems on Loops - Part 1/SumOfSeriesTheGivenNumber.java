import java.util.*;

public class sumOfSeriesTheGivenNumber {
    public static void main(String[] args){
        System.out.print("enter A Number To Sum Of Series Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Sum = 0;
        for(int i=1; i<=num; i++){ // 1-2+3-4+5 = 3
            if(i%2==0){
                Sum -= i;
            }
            else{
                Sum += i;
            }
        }
        
        System.out.print("sum Of Series " + num + " Is : " + Sum);
        sc.close();
     }
    
}
