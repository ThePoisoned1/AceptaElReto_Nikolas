import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E403_EnCamposDeFutbol {
    
    Scanner sc;
    
    void caso() {
        int medidaReal = sc.nextInt();
        int numCampos = sc.nextInt();
        //el campo mas pequeño es 90*45=4050m2
        //el mas grande es 120*90=10800m2
        if (medidaReal >= 4050 * numCampos && medidaReal <= 10800 * numCampos) {
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    
    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new E403_EnCamposDeFutbol().run();
    }
}
