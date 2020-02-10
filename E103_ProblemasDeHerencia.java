/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E103_ProblemasDeHerencia {  Scanner sc;

    public boolean caso() {
        int in = Integer.parseInt(sc.nextLine());
        if (in == 20) {
            return false;
        }
        double rects;
        double y, area, x;
        double[] ecuacion;

        ecuacion = new double[in + 1];
        for (int i = in; i >= 0; i--) {
            ecuacion[i] = sc.nextInt();
        }
        sc.nextLine();
        rects = Integer.parseInt(sc.nextLine());
        area = 0;
        for (double i = 0; i < rects; i += 1) {
            y = 0;
            x = i / rects;
            for (int j = in; j >= 0; j--) {
                y += ecuacion[j] * Math.pow(x, j);
            }

            if (y > 0 && y < 1) {
                area += (y * (1 / rects));
            } else if (y >= 1) {
                area += (1 / rects);
            }
        }
        if (area >= 0.501) {
            System.out.println("CAIN");
        } else if (area <= 0.499) {
            System.out.println("ABEL");
        } else {
            System.out.println("JUSTO");
        }
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E103_ProblemasDeHerencia().run();
    }
}
