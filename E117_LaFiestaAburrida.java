import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E117_LaFiestaAburrida {

    Scanner sc;

    public void caso() {
        String[] input = sc.nextLine().trim().split(" ");

        if (input[0].equals("Soy") || (input[0].equals("soy"))) {
            System.out.println("Hola, " + input[1] + ".");
        }
    }

    public void run() {
        sc = new Scanner(System.in);
        int veces = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
      new E117_LaFiestaAburrida().run();
    }
}
