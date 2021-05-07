import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E192_Por3oMas5 {

    Scanner sc;

    public boolean caso() {
        int numero = sc.nextInt();
        if (numero == 0) {
            return false;
        }
        int aux;
        while (numero != 1) {
            aux = numero;
            if ((numero - 1) % 5 == 0) {
                System.out.println("SI");
                return true;
            } else if (numero % 3 == 0) {
                numero /= 3;
            } else if (numero > 5) {
                numero -= 5;
            }
            if (aux == numero) {
                System.out.println("NO");
                return true;
            }
        }
        System.out.println("SI");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {

        }
    }

    public static void main(String[] args) {
        new E192_Por3oMas5().run();
    }
}
