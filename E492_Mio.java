import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E492_Mio {
    Scanner sc;

    public static void main(String[] args) {
        new E492_Mio().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        long M = sc.nextLong();
        long D = sc.nextLong();
        long P = sc.nextLong();
        if (M == 0 && D == 0 && P == 0) {
            return false;
        }
        System.out.println((int) Math.floor(P / lcm(M, D)));
        return true;
    }

    private long gcd(long a, long b) {
        long temp;
        while (b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }
}
