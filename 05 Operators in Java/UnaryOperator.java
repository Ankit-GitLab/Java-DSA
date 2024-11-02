
public class UnaryOperator {
    public static void main(String[] args) {
        int p = 5, q = 5;
        System.out.println(p++);
        System.out.println(p);

        System.out.println(++q);
        System.out.println(q);

        int x = p++;
        int y = ++q;

        System.out.println(x);
        System.out.println(y);

        System.out.println(p);
        System.out.println(q);

    }
}
