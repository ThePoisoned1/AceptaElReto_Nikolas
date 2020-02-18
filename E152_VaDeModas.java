package AceptaElReto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E152_VaDeModas {

    Scanner sc;

    public boolean caso() {
        int numEntradas = sc.nextInt();
        if (numEntradas == 0) {
            return false;
        }
        int[] nums = new int[numEntradas];
        for (int i = 0; i < numEntradas; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int contador = 1;
        int max = 0;
        int moda = nums[0];
        for (int i = 1; i < numEntradas; i++) {
            if (nums[i] == nums[i - 1]) {
                contador++;
            } else {
                if (contador > max) {
                    max = contador;
                    moda = nums[i - 1];
                }
                contador = 1;
            }
        }

        if (numEntradas != 1 && nums[numEntradas - 1] == nums[numEntradas - 2]) {
            contador++;
            if (contador > max) {
                moda = nums[numEntradas - 1];
            }
        }
        System.out.println(moda);

        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E152_VaDeModas().run();
    }

}
