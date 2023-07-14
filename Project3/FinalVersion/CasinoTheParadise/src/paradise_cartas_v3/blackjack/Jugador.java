/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradise_cartas_v3.blackjack;

import paradise_cartas_v3.cartas.Naipe;
import java.util.ArrayList;

/**
 * Clase para un jugador, o el dealer.
 *
 * @author Equipo 2.
 */
public class Jugador {

    /**
     * El nombre del jugador.
     */
    private String nombre;

    /**
     * Los naipes en la mano actual del jugador.
     */
    private ArrayList<Naipe> mano = new ArrayList<>();

    /**
     * El numero de naipes en la mano actual del jugador.
     */
    private int numNaipes;
    
    /**
     * El estado de si el jugador queda o no.
     */
    private boolean jugadorStays = false;
    
    /**
     * La suma de la mano del jugador.
     */
    private int jugadorSuma;
    
    /**
     * El saldo del jugador
     */
    private int saldo;

    /**
     * Constructor personalizado para un jugador.
     * @param nombre    El nombre del jugador.
     */
    public Jugador(String nombre) {
        this.nombre = nombre;

        this.reiniciarMano();
    }
    
    /**
     * Constructor para obtener el saldo del jugador
     * @param nombre    El nombre del jugador.
     * @param saldo     El saldo del jugador.
     */
    public Jugador(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        
        this.reiniciarMano();
    }

    /**
     * Reinicia la mano del jugador.
     */
    public void reiniciarMano() {
        this.mano.clear();
        this.numNaipes = 0;
    }

    /**
     * Metodo para agregar un naipe a la mano del jugador.
     * @param naipe     El naipe a agregar
     * @return          Si la suma de la mano es menor o igual a 21.
     */
    public boolean agregarNaipe(Naipe naipe) {
        mano.add(naipe);
        numNaipes++;

        return (this.sumaMano() <= 21);
    }

    /**
     * Obtiene la suma de los naipes de la mano actual del jugador.
     * @return      La suma de los naipes.
     */
    public int sumaMano() {
        int suma = 0;
        int numNaipe;
        int numAs = 0;

        for (Naipe naip : this.mano) {
            numNaipe = naip.getNumero();

            if (numNaipe == 1) {    // Un As.
                numAs++;
                suma += 11;
            } else if (numNaipe > 10)   // Una Jota, Reina o Rey.
                suma += 10;
            else
                suma += numNaipe;
        }

        // Si tenemos Ases, y la suma es mayor a 21, algunos o todos los ases se harán 1
        while (suma>21 && numAs>0) {
            suma -= 10;
            numAs--;
        }

        return suma;
    }

    /**
     * Muestra la mano actual del jugador.
     *
     * @param muestraPrimerNaipe Si el primer naipe se mostrara o no.
     */
    public void mostrarMano(boolean muestraPrimerNaipe) {
        System.out.println("Mano de " + this.nombre);
        for (int n=0; n<this.numNaipes; n++) {
            if (n==0 && !muestraPrimerNaipe)
                System.out.println("  [oculto]");
            else
                System.out.printf("  %s\n", this.mano.get(n).toString());
        }

    }
    
    /**
     * Metodo para regresar si el jugador queda o no.
     * @return Si el jugador queda o no.
     */
    public boolean getJugadorStays() {
        return this.jugadorStays;
    }
    
    /**
     * Metodo para actualizar el estado de si el jugador queda o no.
     * @param jugadorStays El estado para el que se actualizara si el jugador queda o no.
     */
    public void actualizaQueda(boolean jugadorStays) {
        this.jugadorStays = jugadorStays;
    }
    
    /**
     * Metodo para regresar la suma de la mano actual del jugador.
     * @return La suma de la mano actual del jugador.
     */
    public int getJugadorSuma() {
        return this.jugadorSuma;
    }
    
    /**
     * Metodo para actualizar la suma de la mano actual del jugador.
     */
    public void actualizaSuma() {
        this.jugadorSuma = this.sumaMano();
    }
    
    /**
     * Metodo para regresar la mano actual del jugador.
     * @return La mano actual del jugador.
     */
    public ArrayList<Naipe> getMano() {
        return this.mano;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    
    public void actualizaSaldo(int nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }
    
}
