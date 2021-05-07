import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E588_VelasBinarias {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new E588_VelasBinarias().run();
    }

    private void run() {
        while (caso()) {

        }
    }

    private boolean caso() {
        long num = sc.nextLong();
        if (num == 0) {
            return false;
        }
        StringBuilder binario = new StringBuilder(Long.toBinaryString(num));
        int tailCeros = 0;
        int i = binario.length() - 1;
        while (i >= 0 && binario.charAt(i) == '0') {
            tailCeros++;
            i--;
        }
        int startingCeros = 0;
        i = 0;
        while (i < binario.length() && binario.charAt(i) == '0') {
            startingCeros++;
            i++;
        }
        for (int j = 0; j < tailCeros - startingCeros; j++) {
            binario.insert(0, "0");
        }
        StringBuilder delReves = new StringBuilder(binario);
        delReves.reverse();
        for (int j = 0; j < delReves.length(); j++) {
            if (binario.charAt(j) != delReves.charAt(j)) {
                System.out.println("NO");
                return true;
            }
        }
        System.out.println("SI");
        return true;
    }
}
