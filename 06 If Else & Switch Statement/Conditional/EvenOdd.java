import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Even or odd : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even Number");
        }
        else{
            System.out.println(num+" is Odd Number");
        }
        sc.close();
    }
}
