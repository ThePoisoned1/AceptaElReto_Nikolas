import java.util.Arrays;
import java.util.Scanner;

public class E609_ReuninonDeTorres {
    Scanner sc;

    public static void main(String[] args) {
        new E609_ReuninonDeTorres().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        if (!sc.hasNext()) {
            return false;
        }
        int numTorres = sc.nextInt();
        numTorres = sc.nextInt();
        int[] ys = new int[(int) numTorres];
        int[] xs = new int[(int) numTorres];
        for (int i = 0; i < numTorres; i++) {
            ys[i] = sc.nextInt();
            xs[i] = sc.nextInt();
        }
        Arrays.sort(ys);
        Arrays.sort(xs);
        int pos = numTorres % 2 == 0 ? (numTorres - 1) / 2 : numTorres / 2;
        System.out.println(ys[pos] + " " + xs[pos]);
        return true;
    }

}