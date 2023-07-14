/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import ActionListeners.Deteccion;
import Persona.Cliente.Cliente;
import Casino.Casino;

/**
 * Esta es la clase que contiene todo lo referente a la estructura de todo lo logico del programa
 * esta esta hecha para que se genera un hilo para cada caballo
 * @author Equipo 2
 */
public class Carrera extends Thread {

    private JLabel eti;
    private FraCarrera p;
    private Deteccion detector;
    private Cliente jugador;
    private Casino casino;

    /**
     * Constructor único de la clase Carrera
     * @param eti representa la etiqueta que contiene a el caballo
     * @param p representa a la variable que contiene a nuestra clase principal
     * @param detector representa la variable utilizada para cambiar de panel
     * @param jugador representa la variable que contiene al jugador junto con todos sus datos
     * @param casino representa la variable que contiene los datos del casino
     */
    public Carrera(JLabel eti, FraCarrera p, Deteccion detector, Cliente jugador, Casino casino) {
        this.eti = eti;
        this.p = p;
        this.detector = detector;
        this.jugador = jugador;
        this.casino = casino;
    }
    
    /*
    Metodo run el cual es utilizado para que corra todo lo que querramos en un hilo diferente
    este contiene todas las sentencias logicas para hacer que el caballo avance y decida quien 
    es el ganador.
    */
    public void run() {

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, a = 0;
        while (true) {
            try {
                sleep((int) (Math.random() * 1000));
                c1 = p.getlbl1().getLocation().x;
                c2 = p.getlbl2().getLocation().x;
                c3 = p.getlbl3().getLocation().x;
                c4 = p.getlbl4().getLocation().x;
                c5 = p.getlbl5().getLocation().x;
                a = (int) ((Math.random() * 6) * (3));
                if ((((c1 < p.getlbl_barrera().getLocation().x - 10 && c2 < p.getlbl_barrera().getLocation().x - 10) && c3 < p.getlbl_barrera().getLocation().x - 10) && c4 < p.getlbl_barrera().getLocation().x - 10) && c5 < p.getlbl_barrera().getLocation().x - 10) {
                    eti.setLocation(eti.getLocation().x + a, eti.getLocation().y);
                    p.repaint();
                } else {
                    break;
                }
            } catch (InterruptedException e) {
            }
            if (eti.getLocation().x >= p.getlbl_barrera().getLocation().x - 10) {
                if ((((c1 > c2) && c1 > c3) && c1 > c4) && c1 > c5) {
                    if (FraCarrera.sele == 5) {
                        jugador.fichas += (FraCarrera.apu * jugador.bono);
                        casino.sumaCaballos((int) (-1*FraCarrera.apu*jugador.bono));
                        FraCarrera.apu = 0;
                    } else {
                        jugador.fichas -= FraCarrera.apu;
                        casino.sumaCaballos((int) (FraCarrera.apu));
                        FraCarrera.apu = 0;
                    }
                    JOptionPane.showMessageDialog(null, "Gano el caballo numero 1 Spirit");
                    detector.setBoton();
                    break;
                } else if ((((c2 > c1) && c2 > c3) && c2 > c4) && c2 > c5) {
                    if (FraCarrera.sele == 4) {
                        jugador.fichas += (FraCarrera.apu * jugador.bono);
                        casino.sumaCaballos((int) (-1*FraCarrera.apu*jugador.bono));
                        FraCarrera.apu = 0;
                    } else {
                        jugador.fichas -= FraCarrera.apu;
                        casino.sumaCaballos((int) (FraCarrera.apu));
                        FraCarrera.apu = 0;
                    }
                    JOptionPane.showMessageDialog(null, "Gano el caballo numero 2 Viernes");
                    detector.setBoton();
                    break;
                } else if ((((c3 > c2) && c3 > c1) && c3 > c4) && c3 > c5) {
                    if (FraCarrera.sele == 3) {
                        jugador.fichas += (FraCarrera.apu * jugador.bono);
                        casino.sumaCaballos((int) (-1*FraCarrera.apu*jugador.bono));
                        FraCarrera.apu = 0;
                    } else {
                        jugador.fichas -= FraCarrera.apu;
                        casino.sumaCaballos((int) (FraCarrera.apu));
                        FraCarrera.apu = 0;
                    }
                    JOptionPane.showMessageDialog(null, "Gano el caballo numero 3 Bojack");
                    detector.setBoton();
                } else if ((((c4 > c2) && c4 > c3) && c4 > c1) && c4 > c5) {
                    if (FraCarrera.sele == 2) {
                        jugador.fichas += (FraCarrera.apu * jugador.bono);
                        casino.sumaCaballos((int) (-1*FraCarrera.apu*jugador.bono));
                        FraCarrera.apu = 0;
                    } else {
                        jugador.fichas -= FraCarrera.apu;
                        casino.sumaCaballos((int) (FraCarrera.apu));
                        FraCarrera.apu = 0;
                    }
                    JOptionPane.showMessageDialog(null, "Gano el caballo numero 4 Secretariat");
                    
                    detector.setBoton();
                    break;
                } else if ((((c5 > c2) && c5 > c3) && c5 > c4) && c5 > c1) {
                    if (FraCarrera.sele == 1) {
                        jugador.fichas += (FraCarrera.apu * jugador.bono);
                        casino.sumaCaballos((int) (-1*FraCarrera.apu*jugador.bono));
                        FraCarrera.apu = 0;
                    } else {
                        jugador.fichas -= FraCarrera.apu;
                        casino.sumaCaballos((int) (FraCarrera.apu));
                        FraCarrera.apu = 0;
                    }
                    JOptionPane.showMessageDialog(null, "Gano el caballo numero 5 Ivan");
                    detector.setBoton();
                    break;
                } else {
                    FraCarrera.apu = 0;
                    JOptionPane.showMessageDialog(null, "Empate nadie gana ni pierde fichas");
                    detector.setBoton();
                    break;

                }
            }
        }
    }
}
