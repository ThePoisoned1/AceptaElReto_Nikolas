import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E523_AburrimientoEnLaAutopista {

    Scanner sc;
    int viejos;
    int nuevos;
    String matriculaEdu;
    int numEdu;

    void checkMatricula(String actual) {
        int numActual = Integer.parseInt(actual.substring(0, 4));

        if ((int) matriculaEdu.charAt(4) > (int) actual.charAt(4)) {
            viejos++;
        } else if ((int) matriculaEdu.charAt(4) < (int) actual.charAt(4)) {
            nuevos++;
        } else {
            if ((int) matriculaEdu.charAt(5) > (int) actual.charAt(5)) {
                viejos++;
            } else if ((int) matriculaEdu.charAt(5) < (int) actual.charAt(5)) {
                nuevos++;
            } else {
                if ((int) matriculaEdu.charAt(6) > (int) actual.charAt(6)) {
                    viejos++;
                } else if ((int) matriculaEdu.charAt(6) < (int) actual.charAt(6)) {
                    nuevos++;
                } else {
                    if (numEdu < numActual) {
                        nuevos++;
                    } else if (numEdu > numActual) {
                        viejos++;

                    }
                }
            }
        }
    }

    void caso() {
        String matricula = "";
        matriculaEdu = sc.next();
        numEdu = Integer.parseInt(matriculaEdu.substring(0, 4));
        viejos = 0;
        nuevos = 0;
        while (!matricula.equals("0")) {
            matricula = sc.next();
            if (!matricula.equals("0")) {
                checkMatricula(matricula);
            }
        }
        System.out.println(viejos + " " + nuevos);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E523_AburrimientoEnLaAutopista().run();
    }
}
