import java.util.Scanner;

public class E613_Unos {
    Scanner sc;

    public static void main(String[] args) {
        new E613_Unos().run();
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
        // https://stackoverflow.com/questions/31413626/how-to-calculate-smallest-multiple-formed-only-of-the-digit-1
        int n = sc.nextInt();
        int number_of_ones = 1;
        long remainder = 1 % n;
        while (remainder != 0) {
            number_of_ones++;
            remainder = (remainder * 10 + 1) % n;
        }

        System.out.println(number_of_ones);
        return true;
    }
}
