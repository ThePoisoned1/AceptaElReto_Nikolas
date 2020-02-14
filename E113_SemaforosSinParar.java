package AceptaElReto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E113_SemaforosSinParar {

    Scanner sc;

    class Semaforo {

        int x, ciclo, tiempoRojo, tiempoVerde;

        Semaforo(int cerrado, int abierto, int totalx) {
            tiempoRojo = cerrado;
            tiempoVerde = abierto;
            ciclo = cerrado + abierto;
            x = totalx;
        }
    }
    int numSemaforos, VelocidadMax;
    double distanciaTotal;
    ArrayList<Semaforo> avenida = new ArrayList<>();

    public boolean comprobador(int fin) {
        double tiempo;
        int cantCiclos;
        for (int i = 0; i < numSemaforos - 1; i++) {
            tiempo = fin * (avenida.get(i).x / distanciaTotal); //lo que tardas en llegar al semaforo
            cantCiclos = ((int) tiempo) / avenida.get(i).ciclo;//ciclos que hace ese semaforo
            tiempo -= posCiclo * avenida.get(i).ciclo;//le restas la cantidad de ciclos completos
            if (tiempo < (avenida.get(i).tiempoRojo - 0.01) && tiempo > 0.01) {//si cuando pasa esta en rojo
                return false;
            }
        }
        return true;
    }

    public boolean caso() {
        numSemaforos = sc.nextInt();
        VelocidadMax = sc.nextInt();
        //si ambos son 0 se acaba el programa
        if (numSemaforos == 0 && VelocidadMax == 0) {
            return false;
        }

        avenida.clear();
        boolean verde0 = false; //por si uno de ellos no se pone verde nunca
        distanciaTotal = 0;
        int rojo, verde, distancia;
        for (int i = 0; i < numSemaforos - 1; i++) {
            distancia = sc.nextInt();
            rojo = sc.nextInt();
            verde = sc.nextInt();
            if (verde == 0) {
                verde0 = true;
            }
            distanciaTotal += distancia;
            Semaforo semaforo = new Semaforo(rojo, verde, (int) distanciaTotal);
            avenida.add(semaforo);
        }
        distancia = sc.nextInt();
        rojo = sc.nextInt();
        verde = sc.nextInt();
        if (verde == 0) {
            verde0 = true;
        }
        distanciaTotal += distancia;
        Semaforo ultimoSemaforo = new Semaforo(rojo, verde, (int) distanciaTotal);

        if (verde0) {
            //si hay uno que no se pone verde es imposible recorrer la avenida
            System.out.println("IMPOSIBLE");
            return true;
        }
        
        //comprueba si se puede hacer en el menor numero de ciclos(depende de la velocidad maxima y de la distancia total)(la manera mas rápida posible)
        double velocidad;
        int ciclosMinimos = ((int) distanciaTotal / VelocidadMax) / ultimoSemaforo.ciclo;//numero de ciclos minimos del ultimo semaforo
        if (ciclosMinimos != (distanciaTotal / VelocidadMax) / ultimoSemaforo.ciclo) {
            if (((int) distanciaTotal / VelocidadMax) < ultimoSemaforo.tiempoRojo) {
                velocidad = distanciaTotal / (double) (ultimoSemaforo.ciclo * ciclosMinimos + ultimoSemaforo.tiempoRojo);
                if (velocidad < 0.1) {
                    //si es posible hacerlo en el menor numero de ciclos pero la velocidad necesaria es inferior a 0,1. Hacerlo en mas ciclos implicaría ir mas lento.
                    System.out.println("IMPOSIBLE");
                    return true;
                }
                if (comprobador(ultimoSemaforo.tiempoRojo)) {
                    //es posible por lo tanto tarda lo que tarde ese semaforo en ponerse verde (si es justo cuando se pone rojo cuenta en el segundo ciclo)
                    System.out.println(ultimoSemaforo.tiempoRojo);
                    return true;
                }
            }
            ciclosMinimos++;//no se puede hacer a velocidad maxima por lo cual se intenta de mandera que el ultimo semaforo haga un ciclo mas
        }
        velocidad = 1;
        while (velocidad >= 0.1) {
            velocidad = distanciaTotal / (double) (ultimoSemaforo.ciclo * ciclosMinimos);
            if (velocidad < 0.1) {
                break;//se cala el coche
            }
            if (comprobador(ultimoSemaforo.ciclo * ciclosMinimos)) {
                //se puede hacer justo antes de ponerse rojo
                System.out.println(ultimoSemaforo.ciclo * ciclosMinimos);
                return true;
            }
            velocidad = distanciaTotal / (double) (ultimoSemaforo.ciclo * ciclosMinimos + ultimoSemaforo.tiempoRojo);
            if (velocidad < 0.1) {
                break;//se cala el coche
            }
            if (comprobador(ultimoSemaforo.ciclo * ciclosMinimos + ultimoSemaforo.tiempoRojo)) {
                //se puede hacer justo al ponerse verde
                System.out.println(ultimoSemaforo.ciclo * ciclosMinimos + ultimoSemaforo.tiempoRojo);
                return true;
            }
            ciclosMinimos++;//lo intentamos hacer en un cilco mas por lo cual la velocidad disminuirá
        }
        //si ha llegado hasta aqui es porque no hay manera de recorrerlo a velocidad constante > 0.1m/s y <velocidadMaxima
            System.out.println("IMPOSIBLE");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E113_SemaforosSinParar().run();
    }
}
