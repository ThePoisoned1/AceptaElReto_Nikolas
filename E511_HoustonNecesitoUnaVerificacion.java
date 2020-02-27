package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E511_HoustonNecesitoUnaVerificacion {

    Scanner sc;

    boolean caso() {
        if (!sc.hasNext()) {
            return false;
        }
        int numGruposA = sc.nextInt();
        int numGruposB = sc.nextInt();
        int numRepeticiones;
        int numero;
        long suma, total = 0;
        int[] repeticionesVectorA = new int[numGruposA];
        int[] numerosVectorA = new int[numGruposA];

        for (int i = 0; i < numGruposA; i++) {
            repeticionesVectorA[i] = sc.nextInt();
            numerosVectorA[i] = sc.nextInt();
        }
        int indiceVectorA = 0;
        for (int i = 0; i < numGruposB; i++) {
            numRepeticiones = sc.nextInt();
            numero = sc.nextInt();
            suma = 0;
            if (numRepeticiones > repeticionesVectorA[indiceVectorA]) {
                while (numRepeticiones > 0) {
                    if (repeticionesVectorA[indiceVectorA] > numRepeticiones) {
                        suma += numRepeticiones * numerosVectorA[indiceVectorA];
                        repeticionesVectorA[indiceVectorA] -= numRepeticiones;
                        numRepeticiones = 0;
                    } else {
                        suma += repeticionesVectorA[indiceVectorA] * numerosVectorA[indiceVectorA];
                        numRepeticiones -= repeticionesVectorA[indiceVectorA];
                        indiceVectorA++;
                    }
                }

            } else {
                repeticionesVectorA[indiceVectorA] -= numRepeticiones;
                suma = numRepeticiones * numerosVectorA[indiceVectorA];
            }
            if (indiceVectorA < numGruposA && repeticionesVectorA[indiceVectorA] == 0) {
                indiceVectorA++;
            }
            total += numero * suma;
        }
        System.out.println(total);

        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E511_HoustonNecesitoUnaVerificacion().run();
    }
}
