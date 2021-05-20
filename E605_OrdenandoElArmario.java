import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E605_OrdenandoElArmario {
    Scanner sc;

    public static void main(String[] args) {
        new E605_OrdenandoElArmario().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        String prenda = sc.next();
        if (prenda.equals(".")) {
            return false;
        }
        int verano=0,invierno=0;
        do {
            switch(prenda){
                case "V":
                    verano++;
                    break;
                case "I":
                    invierno++;
                    break;
                default:
                    break;
            }
            prenda=sc.next();
        } while (!prenda.equals("."));
        if(verano==invierno){
            System.out.println("EMPATE");
            return true;
        }
        System.out.println(verano > invierno ? "VERANO" : "INVIERNO");
        return true;
    }
}
