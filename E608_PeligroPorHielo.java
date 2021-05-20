import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E608_PeligroPorHielo {
    Scanner sc;

    public static void main(String[] args) {
        new E608_PeligroPorHielo().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        int num = sc.nextInt();
        if (num == 0) {
            return false;
        }
        int senyales = 0;
        boolean porEncimaDe6 = true;
        int temp;
        for (int i = 0; i < num; i++) {
            temp = sc.nextInt();
            if (temp <= 4 && (porEncimaDe6 || senyales == 0)) {
                senyales++;
                porEncimaDe6 = false;
            } else if (temp > 6) {
                porEncimaDe6 = true;
            }
        }
        System.out.println(senyales);
        return true;
    }
}
