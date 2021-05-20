import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E604_HonorDistibucion {
    Scanner sc;

    public static void main(String[] args) {
        new E604_HonorDistibucion().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {
        int[] cartasPorPalo = new int[4];
        String palos = "CDPT";
        String figuras = "JQKA";
        String valor, palo;
        int valorFigura;
        int total = 0;
        for (int i = 0; i < 13; i++) {
            valor = sc.next();
            palo = sc.next();
            valorFigura=figuras.indexOf(valor);
            if(valorFigura>=0){
                total +=valorFigura+1;
            }
            cartasPorPalo[palos.indexOf(palo)]++;
        }
        for (int cartas : cartasPorPalo) {
            switch (cartas) {
                case 1:
                    total += 2;
                    break;
                case 2:
                    total += 1;
                    break;
                case 0:
                    total+=3;
                default:
                    break;
            }
        }
        System.out.println(total);
    }
}
