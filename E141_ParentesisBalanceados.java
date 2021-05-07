import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E141_ParentesisBalanceados {

    Scanner sc;

    public boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
        String linea = sc.nextLine();
        StringBuilder parentesis = new StringBuilder();
        for (int i = 0; i < linea.length(); i++) {
            switch (linea.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    parentesis.append(linea.charAt(i));
                    break;
                case ')':
                    if (parentesis.length() != 0 && parentesis.charAt(parentesis.length() - 1) == '(') {
                        parentesis.deleteCharAt(parentesis.length() - 1);
                    } else {
                        System.out.println("NO");
                        return true;
                    }
                    break;
                case ']':
                    if (parentesis.length() != 0 && parentesis.charAt(parentesis.length() - 1) == '[') {
                        parentesis.deleteCharAt(parentesis.length() - 1);
                    } else {
                        System.out.println("NO");
                        return true;
                    }
                    break;
                case '}':
                    if (parentesis.length() != 0 && parentesis.charAt(parentesis.length() - 1) == '{') {
                        parentesis.deleteCharAt(parentesis.length() - 1);
                    } else {
                        System.out.println("NO");
                        return true;
                    }
                    break;
            }
        }
        if (parentesis.length() != 0) {
            System.out.println("NO");
            return true;
        }
        System.out.println("YES");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E141_ParentesisBalanceados().run();
    }
}
