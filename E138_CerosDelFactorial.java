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
public class E138_CerosDelFactorial {

    Scanner sc;

    public void caso() {
        long numero = sc.nextLong();
        long ceros = 0;
        while (numero >= 5) {
            ceros += numero / 5;
            numero = numero / 5;
        }

        System.out.println(ceros);
    }

    public void run() {
        sc = new Scanner(System.in);
        long veces = sc.nextLong();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E138_CerosDelFactorial().run();
    }
}
