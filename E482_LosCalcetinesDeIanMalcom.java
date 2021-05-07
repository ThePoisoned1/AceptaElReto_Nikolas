import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E482_LosCalcetinesDeIanMalcom {

    Scanner sc;

    boolean caso() {
        String calcetines = sc.nextLine();
        if (calcetines.equals(".")) {
            return false;
        }
        int pos = 0;
        int grises = 0;
        int negros = 0;
        while (calcetines.charAt(pos) != '.') {
            if (calcetines.charAt(pos) == 'N') {
                negros++;
            } else if (calcetines.charAt(pos) == 'G') {
                grises++;
            }
            pos += 2;
        }
        if (grises % 2 == 0 && negros % 2 == 0) {
            System.out.println("EMPAREJADOS");
        } else if ((negros == grises && negros % 2 != 0) 
                || (negros + grises) % 2 == 0 && negros != grises) {
            System.out.println("PAREJA MIXTA");
        } else if (negros % 2 == 0 && (negros + grises) % 2 == 1) {
            System.out.println("GRIS SOLITARIO");
        } else if (grises % 2 == 0 && (negros + grises) % 2 == 1) {
            System.out.println("NEGRO SOLITARIO");
        }

        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E482_LosCalcetinesDeIanMalcom().run();
    }
}
