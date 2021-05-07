import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E435_ElPijote {

    Scanner sc;

    boolean comprobarSubnormal(String num) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)) {
                case '0':
                    nums[0]++;
                    break;
                case '1':
                    nums[1]++;
                    break;
                case '2':
                    nums[2]++;
                    break;
                case '3':
                    nums[3]++;
                    break;
                case '4':
                    nums[4]++;
                    break;
                case '5':
                    nums[5]++;
                    break;
                case '6':
                    nums[6]++;
                    break;
                case '7':
                    nums[7]++;
                    break;
                case '8':
                    nums[8]++;
                    break;
                case '9':
                    nums[9]++;
                    break;
                default:
                    break;
            }
        }

        return nums[0] == nums[1]
                && nums[1] == nums[2]
                && nums[1] == nums[3]
                && nums[1] == nums[4]
                && nums[1] == nums[5]
                && nums[1] == nums[6]
                && nums[1] == nums[7]
                && nums[1] == nums[8]
                && nums[1] == nums[9];
    }

    boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
        String numero = sc.nextLine();
        System.out.println(comprobarSubnormal(numero) ? "subnormal" : "no subnormal");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E435_ElPijote().run();
    }

}
