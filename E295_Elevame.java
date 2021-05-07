import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author ThePoisoned1
 */
public class E295_Elevame {

    Scanner sc;
    final BigInteger mod = BigInteger.valueOf(31543);
    final BigInteger zero = BigInteger.ZERO;

    boolean caso() {
        BigInteger numero = sc.nextBigInteger();
        BigInteger potencia = sc.nextBigInteger();
        if (numero.equals(zero) && potencia.equals(zero)) {
            return false;
        }
        System.out.println(numero.modPow(potencia, mod));
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E295_Elevame().run();
    }
}
