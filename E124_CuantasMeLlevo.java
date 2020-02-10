package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E124_CuantasMeLlevo {

    Scanner sc;

    public boolean caso() {
        String input = sc.nextLine();
        if (input.equals("0 0")) {
            return false;
        }
        int meLlevo = 0;
        boolean acarreo = false;
        String[] numeros = input.split(" ");
        while (numeros[0].length() > numeros[1].length()) {
            numeros[1] = "0" + numeros[1];
        }
        while (numeros[1].length() > numeros[0].length()) {
            numeros[0] = "0" + numeros[0];
        }
        int sumaDigitos;
        for (int i = numeros[0].length() - 1; i >= 0; i--) {
            sumaDigitos = Character.getNumericValue(numeros[0].charAt(i)) 
                    + Character.getNumericValue(numeros[1].charAt(i));
            if (acarreo) {
                sumaDigitos++;
            }
            if (sumaDigitos >= 10) {
                meLlevo++;
                acarreo = true;
            } else {
                acarreo = false;
            }
        }
        System.out.println(meLlevo);

        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()){}
    }

    public static void main(String[] args) {
        new E124_CuantasMeLlevo().run();

    }
}
