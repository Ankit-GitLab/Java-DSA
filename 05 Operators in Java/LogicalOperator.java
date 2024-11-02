
public class LogicalOperator {
    public static void main(String[] args) {
        int p = 15, q = 10, r = 5;

        // && operator
        System.out.println((p > q) && (p > r));
        System.out.println((p > q) && (p < r));

        // || operator
        System.out.println((r < q) || (p < q));
        System.out.println((p > q) || (p > r));
        System.out.println((p < q) || (p < r));

        // ! operator
        System.out.println(!(p == q));
        System.out.println(!(p > q));
    }
}
