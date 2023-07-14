/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradise_cartas_v3.cartas;

import java.util.Random;
import java.util.ArrayList;

/**
 * Clase para la baraja inglesa de naipes.
 *
 * @author Equipo 2.
 */

public class Baraja {

    /**
     * Arreglo de naipes en la baraja, 52 naipes por baraja.
     */
    private ArrayList<Naipe> naipes;

    /**
     * El numero de naipes actuales en la baraja.
     */
    private int numeroNaipes;

    /**
     * Constructor por default para 1 baraja sin barajear.
     */
    public Baraja() {

        // Por si no se especifica, tener al menos una baraja y diciendo que no se barajeé.
        this(1, false);
    }

    /**
     * Constructor personalizado para definir el numero de barajas a usar, y si se desea barajear.
     * @param numBarajas    Numero barajas.
     * @param barajear       Si se desea barajear o no.
     */
    public Baraja(int numBarajas, boolean barajear) {
        this.numeroNaipes = numBarajas * 52;
        naipes = new ArrayList<>();

        // Para cada baraja
        for (int b=0; b<numBarajas; b++) {

            // Para cada palo
            for (int p=0; p<4; p++) {

                // Para cada numero
                for (int n=1; n<=13; n++) {
                    naipes.add(new Naipe(Palo.values()[p], n));
                }
            }
        }

        // Barajear de ser necesario
        if (barajear)
            this.barajear();

    }

    /**
     * Metodo para barajear la baraja, intercambiando aleatoriamente cada naipe.
     */
    public void barajear() {

        Random rand = new Random();

        Naipe tempNaipe;

        int j;

        for (int i=0; i<this.numeroNaipes; i++) {
            // Para sacar un naipe aleatorio de la baraja.
            j = rand.nextInt(this.numeroNaipes);
            tempNaipe = naipes.get(i);
            naipes.set(i, naipes.get(j));
            naipes.set(j, tempNaipe);
        }
    }

    /**
     * Saca el siguiente naipe, de hasta arriba de la baraja.
     * @return  El naipe
     */
    public Naipe sacarNaipe() {

        // El naipe de hasta arriba
        Naipe top = naipes.get(0);

        // Quitamos el naipe de la baraja
        naipes.remove(0);
        this.numeroNaipes--;
        return top;
    }

    /**
     * Metodo para imprimir los naipes de hasta arriba.
     * @param numNaipes El numero de naipes a imprimir desde hasta arriba de la baraja
     */
    public void imprimirBaraja(int numNaipes) {

        for(int n=0; n<numNaipes; n++) {
            System.out.printf("% 3d/%d %s\n", n+1, this.numeroNaipes, this.naipes.get(n).toString());
        }
        System.out.println((this.numeroNaipes-numNaipes) + "restantes");
    }
    
    
}
