package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E102_EncriptacionDeMensajes {

    Scanner sc;

    public boolean caso() {
        String texto = sc.nextLine();

        char l = texto.charAt(0);
        int resultado = 0;

        switch (l) {
            case 'a':
                if (!"aQTY".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'l' || l == 'p' || l == 't' || l == 'z' || l == 'f') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'b':
                if (!"bRUZ".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'm' || l == 'q' || l == 'u' || l == 'a' || l == 'g') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'c':
                if (!"cSVA".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'n' || l == 'r' || l == 'v' || l == 'b' || l == 'h') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'd':
                if (!"cSVA".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'o' || l == 's' || l == 'w' || l == 'c' || l == 'i') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'e':
                if (!"eUXC".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'p' || l == 't' || l == 'x' || l == 'd' || l == 'j') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'f':
                if (!"fVYD".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'q' || l == 'u' || l == 'y' || l == 'e' || l == 'k') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'g':
                if (!"gWZX".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'r' || l == 'v' || l == 'z' || l == 'f' || l == 'l') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'h':
                if (!"hXAE".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 's' || l == 'w' || l == 'a' || l == 'g' || l == 'm') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'i':
                if (!"iYBF".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 't' || l == 'x' || l == 'b' || l == 'h' || l == 'n') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'j':
                if (!"jZCG".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'u' || l == 'y' || l == 'c' || l == 'i' || l == 'o') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'k':
                if (!"kADH".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'v' || l == 'z' || l == 'd' || l == 'j' || l == 'p') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'l':
                if (!"lBEI".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'w' || l == 'a' || l == 'e' || l == 'k' || l == 'q') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'm':
                if (!"mCFJ".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'x' || l == 'b' || l == 'f' || l == 'l' || l == 'r') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'n':
                if (!"nDGK".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'y' || l == 'c' || l == 'g' || l == 'm' || l == 's') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'o':
                if (!"oEHL".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'z' || l == 'd' || l == 'h' || l == 'n' || l == 't') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
                            case 'p':
                if (!"pFIN".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'q':
                if (!"qGJO".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'b' || l == 'f' || l == 'j' || l == 'p' || l == 'v') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'r':
                if (!"rHKP".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'c' || l == 'g' || l == 'k' || l == 'q' || l == 'w') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 's':
                if (!"sILQ".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'd' || l == 'h' || l == 'l' || l == 'r' || l == 'x') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 't':
                if (!"tJMR".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'e' || l == 'i' || l == 'm' || l == 's' || l == 'y') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'u':
                if (!"uKNS".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'f' || l == 'j' || l == 'n' || l == 't' || l == 'z') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'v':
                if (!"vLOT".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'g' || l == 'k' || l == 'o' || l == 'u' || l == 'a') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'w':
                if (!"wMPU".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'h' || l == 'l' || l == 'p' || l == 'v' || l == 'b') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'x':
                if (!"xNQV".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'i' || l == 'm' || l == 'q' || l == 'w' || l == 'c') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'y':
                if (!"yORW".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'j' || l == 'n' || l == 'r' || l == 'x' || l == 'd') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
            case 'z':
                if (!"zPSX".equals(texto)) {
                    texto = texto.toLowerCase();
                    for (int i = 1; i < texto.length(); i++) {
                        l = texto.charAt(i);
                        if (l == 'k' || l == 'o' || l == 's' || l == 'y' || l == 'e') {
                            resultado++;
                        }
                    }
                    System.out.println(resultado);
                } else {
                    return false;
                }
                break;
        }
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E102_EncriptacionDeMensajes().run();
    }
}
