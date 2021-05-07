import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E140_SumaDeDigitos {

    Scanner sc;

    public boolean caso() {
        String numero = sc.nextLine();
        if (Long.parseLong(numero) < 0) {
            return false;
        }
       int suma = 0;
        for (int i = 0; i < numero.length(); i++) {
            if (i == numero.length() - 1) {
                System.out.print(numero.charAt(i) + " = ");
            } else {
                System.out.print(numero.charAt(i) + " + ");
            }
            suma = suma + Character.getNumericValue(numero.charAt(i));
        }
        System.out.println(suma);
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E140_SumaDeDigitos().run();
    }

}
