/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradise_cartas_v3.cartas;

import java.util.Comparator;

/**
 * Implementación del tipo de naipe.
 *
 * @author Equipo 2.
 */

public class Naipe {

    /**
     * 4 posibles palos, treboles, diamantes, picas, corazones
     */
    private Palo palo;

    /**
     * El valor del naipe, As = 1, Jota - Rey = 11 - 13
     */
    private int numero;

    /**
     * Para imprimir el numero del naipe en letra
     */
    private String numALetra[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jota", "Reina", "Rey"};

    /**
     * Constructor personalizado del naipe.
     * @param palo      El palo del naipe.
     * @param numero    El numero del naipe.
     */
    public Naipe(Palo palo, int numero) {
        this.palo = palo;

        if(numero >= 1 && numero <= 13)
            this.numero = numero;
        else {
            System.out.println("Numero invalido para el naipe.");
        }
    }

    /**
     * Metodo para obtener el numero del naipe.
     * @return      El numero del naipe.
     */
    public int getNumero() {
        return numero;
    }
    
    /**
     * Metodo para obtener el palo del naipe.
     * @return El palo del naipe.
     */
    public String getPalo() {
        return this.palo.toString();
    }

    @Override
    public String toString() {
        return numALetra[getNumero()-1] + " de " + palo.toString();
    }
    
    public static class sortByNum implements Comparator<Naipe> {
        public int compare(Naipe a, Naipe b) {
            return a.getNumero() - b.getNumero();
        }
    }


}
