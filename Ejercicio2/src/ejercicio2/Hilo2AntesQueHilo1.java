package ejercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dfloresalarcon
 */
public class Hilo2AntesQueHilo1 extends Thread {

    private String nombre;

    public Hilo2AntesQueHilo1(String nombre) {
        this.nombre=nombre;
    }

    public Hilo2AntesQueHilo1() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        System.out.println("Soy HILO " +this.nombre);

        try {
            sleep((long) (Math.random() * (1000 - 500) + 100));
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo2AntesQueHilo1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
