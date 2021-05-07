import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E525_MultasDesdeElCielo {

    Scanner sc;

    void caso() {
        int inicioDron1 = sc.nextInt();
        int finDron1 = sc.nextInt();
        int aux;
        if (finDron1 > inicioDron1) {
            aux = finDron1;
            finDron1 = inicioDron1;
            inicioDron1 = aux;
        }
        int inicioDron2 = sc.nextInt();
        int finDron2 = sc.nextInt();
        if (finDron2 > inicioDron2) {
            aux = finDron2;
            finDron2 = inicioDron2;
            inicioDron2 = aux;
        }
        if (inicioDron1 > inicioDron2) {
            if (finDron1 < inicioDron2 || inicioDron1 <= finDron2) {
                System.out.println("SOLAPADOS");
            } else {
                System.out.println("SEPARADOS");
            }
        } else if (inicioDron2 > inicioDron1) {
            if (finDron2 < inicioDron1 || inicioDron2 <= finDron1) {
                System.out.println("SOLAPADOS");
            } else {
                System.out.println("SEPARADOS");
            }
        } else if (inicioDron1 == inicioDron2 || finDron1 == finDron2) {
            System.out.println("SOLAPADOS");
        } else {
            System.out.println("SEPARADOS");
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
        new E525_MultasDesdeElCielo().run();
    }
}
