import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E155_PerimetroDeUnRectangulo {

    Scanner sc;

    public boolean caso() {
        int ladoX = sc.nextInt();
        int ladoY = sc.nextInt();
        if (ladoX < 0 || ladoY < 0) {
            return false;
        }
        System.out.println((ladoX*2 + ladoY*2));
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E155_PerimetroDeUnRectangulo().run();
    }
}
