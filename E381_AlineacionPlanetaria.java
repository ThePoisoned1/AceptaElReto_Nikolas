import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E381_AlineacionPlanetaria {

    Scanner sc;
    PriorityQueue<Integer> planetas= new PriorityQueue<>();

    public int mcd(int num1, int num2) {
        int mcd;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);
        return mcd;
    }

    public int mcm(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        return (a / mcd(a, b)) * b;
    }

    public boolean caso() {
        int numPlanetas = sc.nextInt();
        if (numPlanetas == 0) {
            return false;
        }
        planetas.clear();
        int aux;
        for (int i = 0; i < numPlanetas; i++) {
            planetas.add(sc.nextInt());
            if (planetas.size() > 1) {
                aux = mcm(planetas.poll(), planetas.poll());
                planetas.add(aux);
            }
        }
        while (planetas.size() > 1) {
            aux = mcm(planetas.poll(), planetas.poll());
            planetas.add(aux);
        }
        System.out.println(planetas.poll());

        return true;
    }
    public void run(){
    sc = new Scanner(System.in);
    while(caso()){}
    }
    public static void main(String[] args) {
        new E381_AlineacionPlanetaria().run();
    }

}

