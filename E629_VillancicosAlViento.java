import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E629_VillancicosAlViento {
    Scanner sc;

    public static void main(String[] args) {
        new E629_VillancicosAlViento().run();
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
        int[] volumenes = new int[num];
        for (int i = 0; i < volumenes.length; i++) {
            volumenes[i] = sc.nextInt();
        }
        int buffer = 0;
        int count = 0;
        for (int i = volumenes.length - 1; i >= 0; i--) {
            if (buffer > 0) {
                count++;
                buffer--;
            }
            if (volumenes[i] > buffer) {
                buffer = volumenes[i];
            }
        }
        System.out.println(count);
        return true;
    }
}