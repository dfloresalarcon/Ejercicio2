package ejercicio2;

/**
 *
 * @author dfloresalarcon
 */
public class Ejercicio2 {

    public static void main(String[] args) throws InterruptedException {

        Hilo2AntesQueHilo1 h1 = new Hilo2AntesQueHilo1("hilo1");
        Hilo2AntesQueHilo1 h2 = new Hilo2AntesQueHilo1("hilo2");

        h2.start();
        h2.join();

        h1.start();
        h1.join();

        System.out.println("----Finalizado----");
    }

}
