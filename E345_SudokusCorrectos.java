import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E345_SudokusCorrectos {

    int[][] sudoku = new int[9][9];
    Scanner sc;

    boolean comprobador(int[] aux) {
        Arrays.sort(aux);
        return aux[0] < aux[1]
                && aux[1] < aux[2]
                && aux[2] < aux[3]
                && aux[3] < aux[4]
                && aux[4] < aux[5]
                && aux[5] < aux[6]
                && aux[6] < aux[7]
                && aux[7] < aux[8];

    }

    boolean comprobar3x3(int inicio1, int inicio2) {
        int[] aux = new int[9];
        aux[0] = sudoku[inicio1][inicio2];
        inicio2++;
        aux[1] = sudoku[inicio1][inicio2];
        inicio2++;
        aux[2] = sudoku[inicio1][inicio2];
        inicio1++;
        inicio2 -= 2;
        aux[3] = sudoku[inicio1][inicio2];
        inicio2++;
        aux[4] = sudoku[inicio1][inicio2];
        inicio2++;
        aux[5] = sudoku[inicio1][inicio2];
        inicio1++;
        inicio2 -= 2;
        aux[6] = sudoku[inicio1][inicio2];
        inicio2++;
        aux[7] = sudoku[inicio1][inicio2];
        inicio2++;
        aux[8] = sudoku[inicio1][inicio2];

        return comprobador(aux);

    }

    boolean comprobarLineas() {
        int[] aux = new int[9];
        for (int i = 0; i < 9; i++) {
            aux[0] = sudoku[i][0];
            aux[1] = sudoku[i][1];
            aux[2] = sudoku[i][2];
            aux[3] = sudoku[i][3];
            aux[4] = sudoku[i][4];
            aux[5] = sudoku[i][5];
            aux[6] = sudoku[i][6];
            aux[7] = sudoku[i][7];
            aux[8] = sudoku[i][8];
            if (!comprobador(aux)) {
                return false;
            }
        }
        return true;
    }

    boolean comprobarColumnas() {
        int[] aux = new int[9];
        for (int i = 0; i < 9; i++) {
            aux[0] = sudoku[0][i];
            aux[1] = sudoku[1][i];
            aux[2] = sudoku[2][i];
            aux[3] = sudoku[3][i];
            aux[4] = sudoku[4][i];
            aux[5] = sudoku[5][i];
            aux[6] = sudoku[6][i];
            aux[7] = sudoku[7][i];
            aux[8] = sudoku[8][i];
            if (!comprobador(aux)) {
                return false;
            }
        }
        return true;

    }

    void caso() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = sc.nextInt();
            }
        }
        boolean correcto = comprobarColumnas();
        if (correcto) {
            correcto = comprobarLineas();
        }
        if (correcto) {
            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j += 3) {
                    if (correcto) {
                        correcto = comprobar3x3(i, j);
                    }
                }
            }

        }
        System.out.println(correcto ? "SI" : "NO");
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E345_SudokusCorrectos().run();
    }

}
