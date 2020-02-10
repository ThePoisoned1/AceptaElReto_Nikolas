package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E144_TecladoEstropeado {

    Scanner sc;

    public boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }

        char[] charArrayInput = sc.nextLine().toCharArray();
        char[] charArrayOutput = new char[charArrayInput.length];
        int outIndex;
        int maxIndex;
        String Output;
        outIndex = 0;
        maxIndex = 0;
        for (int i = 0; i < charArrayInput.length; i++) {
            switch (charArrayInput[i]) {
                case '-':
                    outIndex = 0;
                    break;
                case '+':
                    outIndex = maxIndex;
                    break;
                case '*':
                    if (outIndex < maxIndex) {
                        outIndex++;
                    }
                    break;
                case '3':
                    if (maxIndex != 0 && maxIndex != outIndex) {
                        for (int j = outIndex; j < charArrayOutput.length - 1; j++) {
                            charArrayOutput[j] = charArrayOutput[j + 1];
                        }
                        charArrayOutput[charArrayOutput.length - 1] = ' ';
                        maxIndex--;
                    }
                    break;
                default:
                    for (int j = charArrayOutput.length - 1; j > outIndex; j--) {
                        charArrayOutput[j] = charArrayOutput[j - 1];
                    }
                    charArrayOutput[outIndex] = charArrayInput[i];
                    outIndex++;
                    maxIndex++;
                    break;
            }
        }
        Output = new String(charArrayOutput);
        System.out.println(Output.substring(0, maxIndex));
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while(caso()){}
    }

    public static void main(String[] args) {
        new E144_TecladoEstropeado().run();
    }
}
