/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradise_cartas_v3.poker;

import java.util.ArrayList;
import paradise_cartas_v3.cartas.*;

/**
 * Clase para el jugador de poker.
 * @author Equipo 2.
 */
public class JugadorPoker {
    
    /**
     * El nombre del jugador.
     */
    private String nombre;
    
    /**
     * El saldo del jugador.
     */
    private int saldo = 1000;
    
    /**
     * Si el jugador "checa" o no.
     */
    private boolean jugadorCheck = true;
    
    /**
     * La mano del jugador.
     */
    private ArrayList<Naipe> manoJugador = new ArrayList<>();
        
    /**
     * Constructor personalizado para un jugador.
     * @param nombre    El nombre del jugador.
     */
    public JugadorPoker(String nombre) {
        this.nombre = nombre;

        this.reiniciarMano();
    }
    
    /**
     * Constructor para obtener el saldo del jugador
     * @param nombre    El nombre del jugador.
     * @param saldo     El saldo del jugador.
     */
    public JugadorPoker(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        
        //this.reiniciarMano();
    }

    /**
     * Reinicia la mano del jugador.
     */
    public void reiniciarMano() {
        this.manoJugador.clear();
    }
    
    /**
     * Metodo para agregar un naipe a la mano del jugador.
     * @param naipe     El naipe a agregar.
     */
    public void agregarNaipe(Naipe naipe) {
        manoJugador.add(naipe);
    }
    
    /**
     * Muestra la mano actual del jugador.
     *
     * @param muestraPrimerNaipe Si el primer naipe se mostrara o no.
     */
    public void mostrarMano(boolean muestraPrimerNaipe) {
        System.out.println("Mano de " + this.nombre);
        int numNaipes = manoJugador.size();
        for (int n=0; n<numNaipes; n++) {
            if (n==0 && !muestraPrimerNaipe)
                System.out.println("  [oculto]");
            else
                System.out.printf("  %s\n", this.manoJugador.get(n).toString());
        }

    }
    
    /**
     * Metodo para regresar si el jugador queda o no.
     * @return Si el jugador queda o no.
     */
    public boolean getJugadorCheck() {
        return this.jugadorCheck;
    }
    
    /**
     * Metodo para actualizar si el jugador "checa" o no.
     * @param check valor booleano de si el jugador checa.
     */
    public void actualizaCheck(boolean check) {
        this.jugadorCheck = check;
    }
    
    /**
     * Metodo para regresar la mano actual del jugador.
     * @return La mano actual del jugador.
     */
    public ArrayList<Naipe> getMano() {
        return this.manoJugador;
    }
    
    /**
     * Metodo para obtener el saldo actual del jugador.
     * @return  El saldo actual del jugador.
     */
    public int getSaldo() {
        return this.saldo;
    }
    
    /**
     * Metodo para actualizar el saldo del jugador.
     * @param nuevoSaldo    El nuevo saldo del jugador.
     */
    public void actualizaSaldo(int nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }
    
    /**
     * Metodo para descontar del saldo del jugador, la apuesta ciega que le corresponde.
     * @param blind     La cantidad de la apuesta ciega.
     */
    public void apuestaBase(int blind) {
        this.saldo -= blind;
    }
    
}
