import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E163_SumaleUno {

    Scanner sc;

    public boolean caso() {
        String input = sc.nextLine();
        if (input.equals("FIN")) {
            return false;
        }
        String output = "";
        int acarreo = 1;
        int aux;
        for (int i = input.length() - 1; i > -1; i--) {
            aux = acarreo;
            acarreo = 0;
            switch (input.charAt(i)) {
                case '0':
                    aux += 0;
                    break;
                case '1':
                    aux += 1;
                    break;
                case '2':
                    aux += 2;
                    break;
                case '3':
                    aux += 3;
                    break;
                case '4':
                    aux += 4;
                    break;
                case '5':
                    aux += 5;
                    break;
                case '6':
                    aux += 6;
                    break;
                case '7':
                    aux += 7;
                    break;
                case '8':
                    aux += 8;
                    break;
                case '9':
                    aux += 9;
                    break;
                case 'A':
                case 'a':
                    aux += 10;
                    break;
                case 'B':
                case 'b':
                    aux += 11;
                    break;
                case 'C':
                case 'c':
                    aux += 12;
                    break;
                case 'D':
                case 'd':
                    aux += 13;
                    break;
                case 'E':
                case 'e':
                    aux += 14;
                    break;
                case 'F':
                case 'f':
                    aux += 15;
                    break;
                default:
                    break;
            }
            if (aux > 15 && i != 0) {
                acarreo = 1;
                aux -= 16;
            }
            output = Integer.toHexString(aux).toUpperCase() + output;
        }
        System.out.println(output);
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E163_SumaleUno().run();
    }
}
