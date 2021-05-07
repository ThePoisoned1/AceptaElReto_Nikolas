import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ThePoisoned1
 */
public class E185_Potitos {

    Scanner sc;

    public boolean caso() {
        int in = Integer.parseInt(sc.nextLine());
        if (in == 0) {
            return false;
        }
        TreeSet<String> si = new TreeSet<>();
        TreeSet<String> out = new TreeSet<>();
        TreeSet<String> no = new TreeSet<>();
        String[] split;

        for (int i = 0; i < in; i++) {
            split = sc.nextLine().split(" ");
            if (split[0].equals("SI:")) {
                for (int j = 1; j < split.length - 1; j++) {
                    si.add(split[j]);
                }
            } else {
                for (int j = 1; j < split.length - 1; j++) {
                    no.add(split[j]);
                }
            }
        }
        for (String i : no) {
            if (!si.contains(i)) {
                out.add(i);
            }
        }
        if (out.size() >= 1) {
            int aux = 0;
            for (String i : out) {
                aux++;
                if (aux == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
            System.out.println("");
        } else {
            System.out.println("");
        }
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E185_Potitos().run();
    }

}
