import java.util.Scanner;

public class SimpleInterest {
    @SuppressWarnings("resource")
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal");
        float p = sc.nextFloat();

        System.out.println("Enter rate of interest");
        float r = sc.nextFloat();

        System.out.println("Enter time");
        float t = sc.nextFloat();
        System.out.println("Principul : " +p);
        System.out.println("Rate of Interest : " +r);
        System.out.println("time : " +t);

        float si = (p * r * t)/100;
        System.out.println("Simple Interest : " +si);
    }
}
