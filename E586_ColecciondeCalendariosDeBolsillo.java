import java.util.Scanner;
 
/**
 *
 * @author ThePoisoned1
 */
public class E586_ColecciondeCalendariosDeBolsillo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int guardados;
        int max, min, aux;
        for (int i = 0; i < n; i++) {
            guardados = sc.nextInt();
            sc.nextLine();
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            for (int j = 0; j < guardados; j++) {
                aux = sc.nextInt();
                if (aux > max) {
                    max = aux;
                }
                if (aux < min) {
                    min = aux;
                }
            }
            sc.nextLine();
            System.out.println(max - min - guardados + 1);
        }
    }
}
