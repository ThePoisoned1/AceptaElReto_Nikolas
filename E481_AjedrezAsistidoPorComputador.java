import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E481_AjedrezAsistidoPorComputador {

    Scanner sc;

    boolean caso() {
        int letra = sc.nextInt();
        int numero = sc.nextInt();
        if (letra == 0 && numero == 0) {
            return false;
        }
        switch (letra) {
            case 1:
                System.out.print("h");
                break;
            case 2:
                System.out.print("g");
                break;
            case 3:
                System.out.print("f");
                break;
            case 4:
                System.out.print("e");
                break;
            case 5:
                System.out.print("d");
                break;
            case 6:
                System.out.print("c");
                break;
            case 7:
                System.out.print("b");
                break;
            case 8:
                System.out.print("a");
                break;

        }
        System.out.println(numero);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E481_AjedrezAsistidoPorComputador().run();
    }
}
