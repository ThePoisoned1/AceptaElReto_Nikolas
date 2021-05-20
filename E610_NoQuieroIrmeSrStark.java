import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E610_NoQuieroIrmeSrStark {
    Scanner sc;

    public static void main(String[] args) {
        new E610_NoQuieroIrmeSrStark().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {
        int poblacion = sc.nextInt();
        int stark = sc.nextInt();
        int peter = sc.nextInt();
        int salto = sc.nextInt();
        List<Integer> personas = new ArrayList<>();
        for (int i = 1; i <= poblacion; i++) {
            personas.add(i);
        }
        int pos = 0;
        int kills = ((int) (poblacion / 2))+poblacion%2;
        for (int i = 0; i < kills; i++) {
            pos = (pos + salto) % poblacion;
            personas.remove(pos);
            poblacion--;
        }  
        boolean starkVivo = personas.contains(stark);
        boolean peterVivo = personas.contains(peter);
        if (peterVivo && !starkVivo) {
            System.out.println("No quiero irme, Peter!");
        } else if (!peterVivo && starkVivo) {
            System.out.println("No quiero irme, Sr. Stark!");
        } else {
            System.out.println("No hay abrazo");
        }

    }
}
