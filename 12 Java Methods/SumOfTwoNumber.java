import java.util.*;
class Algebra{
    int add(int a, int b){
        int ans = a+b;
        return ans;
    }
}

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st Number : ");
        int x = sc.nextInt();
        System.out.print("enter 2nd Number : ");
        int y = sc.nextInt();

        System.out.print("sum Of Input Number Is : ");
        int ans = obj.add(x,y);
        System.out.print(ans);
        sc.close();
    }
}
