import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E109_LigaDePadel {

       Scanner sc;

    public int partidosRestantes(HashMap<String, Integer> equipos, int partidos) {
        return equipos.size() * (equipos.size() - 1) - partidos;
    }

    public String getGanador(HashMap<String, Integer> equipos) {
        int aux = -1;
        boolean empate = true;
        String top = "profe el 10 pls";
        for (String i : equipos.keySet()) {
            if (equipos.get(i) > aux) {
                aux = equipos.get(i);
                empate = false;
                top = i;
            } else if (equipos.get(i) == aux) {
                empate = true;
            }
        }
        if (empate) {
            return "EMPATE";
        } else {
            return top;
        }
    }

    public void addPuntos(HashMap<String, Integer> equipos, String equipo, int pts) {
        if (!equipos.containsKey(equipo)) {
            equipos.put(equipo, pts);
        } else {
            equipos.put(equipo, equipos.get(equipo) + pts);
        }
    }

    public int leerPartidos(HashMap<String, Integer> equipos) {
        String input = sc.nextLine();
        String e1, e2;
        String[] split;
        int s1, s2;
        int p = 0;
        while (!input.equals("FIN")) {
            split = input.split(" ");
            e1 = split[0];
            e2 = split[2];
            s1 = Integer.parseInt(split[1]);
            s2 = Integer.parseInt(split[3]);
            if (s1 > s2) {
                addPuntos(equipos, e1, 2);
                addPuntos(equipos, e2, 1);

            } else {
                addPuntos(equipos, e2, 2);
                addPuntos(equipos, e1, 1);
            }
            p++;
            input = sc.nextLine();
        }
        return p;
    }

    public boolean caso() {

        String input = sc.nextLine();
        if (input.equals("FIN")) {
            return false;
        }
        HashMap<String, Integer> equipos = new HashMap<>();
        int p;

        p = leerPartidos(equipos);

        System.out.println(getGanador(equipos) + " " + partidosRestantes(equipos, p));
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E109_LigaDePadel().run();

    }
}
