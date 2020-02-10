package AceptaElReto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E380_MeCaso {

    Scanner sc;

    public boolean caso() {
        long numGastos = sc.nextLong();
        if (numGastos == 0) {
            return false;
        }
        long coste=0;
        for (int i = 0; i < numGastos; i++) {
            coste+=sc.nextLong();
        }
        System.out.println(coste);
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E380_MeCaso().run();
    }
}
