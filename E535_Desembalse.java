import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E535_Desembalse {

    Scanner sc;

    boolean caso() {
        int distancia = sc.nextInt();
        if (distancia == 0) {
            return false;
        }
        int tierra = 0;
        int altura;
        for (int i = 0; i < distancia - 1; i++) {
            altura = sc.nextInt();
            tierra += altura;
        }
        altura=sc.nextInt();
        tierra += altura;
        System.out.println(distancia * altura - tierra);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E535_Desembalse().run();
    }
}
