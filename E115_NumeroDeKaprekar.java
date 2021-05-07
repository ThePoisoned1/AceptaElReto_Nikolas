import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E115_NumeroDeKaprekar {

    Scanner sc;

    public boolean esKaprekar(long num) {
        long izq = num * num, der = 0, decena = 1;
        boolean es = false;
        while (izq > 0 && !es) {
            der = der + izq % 10 * decena;
            izq = izq / 10;
            decena = decena * 10;
            if (der > 0 && izq + der == num) {
                es = true;
            }
        }
        return es;
    }

    public boolean caso() {
        long numero = sc.nextLong();
        if (numero == 0) {
            return false;
        }
        System.out.println(esKaprekar(numero) ? "SI" : "NO");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E115_NumeroDeKaprekar().run();
    }
}
