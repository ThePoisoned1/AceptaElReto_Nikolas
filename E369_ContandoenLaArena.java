import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E369_ContandoenLaArena {
        Scanner sc;  

    boolean caso() {
        int numero=sc.nextInt();
        if (numero==0) {
            return false;
        }
        for (int i = 0; i < numero; i++) {
            System.out.print(1);
        }
        System.out.println("");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E369_ContandoenLaArena().run();
    }
}
