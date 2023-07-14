/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tragamonedas;

import java.util.concurrent.ExecutionException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingWorker;
import Persona.Cliente.Cliente;
import Casino.Casino;

/**
 * Clase que se encarga de designar si gano o no y añadir las fichas a el saldo del jugador
 * @author Equipo 2
 */
public class Verificador extends SwingWorker<Boolean, Void> {

    private JLabel credito;
    private JLabel apuesta;
    private JButton b1, b2, b3, b4, b5;
    private Cliente jugador;
    private Casino casino;
    SwingWorker swingWorkerA;
    SwingWorker swingWorkerB;
    SwingWorker swingWorkerC;
    
    /**
     * Constructor de clase
     * @param a establece el valor de a
     * @param b establece el valor de b
     * @param c establece el valor de c
     * @param cr establece el valor del Jlabel de credito
     * @param ap establece el valor del Jlabel de apuesta
     * @param b1 establece el valor del Boton 1
     * @param b2 establece el valor del Boton 2
     * @param b3 establece el valor del Boton 3
     * @param b4 establece el valor del Boton 4
     * @param jugador establece el valor del jugador
     * @param casino establece el valor del casino
     */
    Verificador(SwingWorker a, SwingWorker b, SwingWorker c, JLabel cr, JLabel ap, JButton b1, JButton b2, JButton b3, JButton b4, Cliente jugador, Casino casino) {
        this.swingWorkerA = a;
        this.swingWorkerB = b;
        this.swingWorkerC = c;
        credito = cr;
        apuesta = ap;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.jugador = jugador;
        this.casino = casino;

    }
/**
 * Metodo que decide si se gano o no
 * @throws Exception marca que el metodo puede marcar una exepcion
 */
    @Override
    protected Boolean doInBackground() throws Exception {

        int val1 = (Integer) swingWorkerA.get();
        int val2 = (Integer) swingWorkerB.get();
        int val3 = (Integer) swingWorkerC.get();
        if (val1 == val2 && val2 == val3) {
            return true;//gana
        } else {
            return false;//pierde
        }
    }
    /**
     * Metodo que actualiza el saldo del jugador
    */
    @Override
    protected void done() {
        try {
            //segun resultado de juego actualiza interfaz
            if (get()) {
                jugador.fichas += (Tragaperras.apu * jugador.bono);
                casino.sumaTragamonedas((int) (-1 * Tragaperras.apu * jugador.bono));
                credito.setText("" + String.valueOf(jugador.fichas));
                Tragaperras.apu = 0;
                apuesta.setText("" + String.valueOf(Tragaperras.apu));

            } else {
                jugador.fichas -= Tragaperras.apu;
                casino.sumaTragamonedas((int) (Tragaperras.apu));
                credito.setText("" + String.valueOf(jugador.fichas));
                Tragaperras.apu = 0;
                apuesta.setText("" + String.valueOf(Tragaperras.apu));
            }
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
        } catch (InterruptedException ex) {
            System.err.println("InterruptedException: " + ex.getMessage());
        } catch (ExecutionException ex) {
            System.err.println("ExecutionException: " + ex.getMessage());
        }
    }

}
