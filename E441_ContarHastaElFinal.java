import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E441_ContarHastaElFinal {

    Scanner sc;

    public boolean caso() {
        StringBuilder input = new StringBuilder(sc.nextLine());
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '.') {
                input.deleteCharAt(i);
                i-=2;
            }
        }
        BigInteger num = new BigInteger(input.toString());
        num = num.add(BigInteger.valueOf(1));
        StringBuilder output = new StringBuilder(num.toString());
            for (int i = output.length() - 3; i > 0; i -= 3) {
                    output.insert(i, ".");
            }
            System.out.println(output);
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E441_ContarHastaElFinal().run();
    }
}
