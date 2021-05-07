import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E346_ElHombreConSeisDedos {

    Scanner sc;

    boolean caso() {
        int numNacimientos = sc.nextInt();
        int intervaloAnyos = sc.nextInt();
        if (numNacimientos == 0 && intervaloAnyos == 0) {
            return false;
        }
        int[] nums = new int[numNacimientos];
        int count = 0;
        int pos1 = 0;
        int end = 0;
        for (int i = 0; i < numNacimientos; i++) {
            nums[i] = sc.nextInt();
            if (i == 0) {
                end = nums[0] + intervaloAnyos;
            }
            if (nums[i] >= nums[pos1] && nums[i] < end) {
                count++;
            } else if (nums[i] >= end) {
                pos1++;
                end = nums[pos1] + intervaloAnyos;
            }
        }
        System.out.println(count);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E346_ElHombreConSeisDedos().run();
    }
}
