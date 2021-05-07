import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E582_SonLosCuartos {
    Scanner sc;

    public static void main(String[] args) {
        new E582_SonLosCuartos().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {
        String linea = sc.nextLine();
        if(linea.length() < 1){
            System.out.println("MARISA NARANJO");
            return;
        }
        List<String> come  = Arrays.asList(linea.split(" "));
        if(come.contains("ding-dong")){
            System.out.println("SALIDA NULA");
            return;
        }
        System.out.println(come.size()<12 ? "TARDE" : "CORRECTO");
    } 
}
