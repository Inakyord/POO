/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradise_cartas_v3.blackjack;

import java.util.ArrayList;
import paradise_cartas_v3.cartas.Baraja;
import paradise_cartas_v3.cartas.Naipe;

/**
 * Clase para el juego de Black Jack.
 * @author Equipo 2.
 */

public class BlackJack {
    private static Baraja miBaraja = new Baraja(1, true);

    private static Jugador jugador1 = new Jugador("Palatio", 1000);
    private static Jugador dealer = new Jugador("Dealer");
    
    /**
     * Metodo para simular la primera ronda.
     */
    public void primeraRonda() {
        
        jugador1.agregarNaipe(miBaraja.sacarNaipe());
        dealer.agregarNaipe(miBaraja.sacarNaipe());
        jugador1.agregarNaipe(miBaraja.sacarNaipe());
        dealer.agregarNaipe(miBaraja.sacarNaipe());
    }

    /**
     * Metodo para iniciar el juego de Black Jack.
     * @return  Un entero que dictamina quien gano.
     */
    public int iniciaBlackJack() {

//           primeraRonda();

        // Mostrar la primera ronda
//        System.out.println("Ronda servida");
//        jugador1.mostrarMano(true);
//        dealer.mostrarMano(false);
//        System.out.println("\n");
        jugador1.agregarNaipe(miBaraja.sacarNaipe());
        dealer.agregarNaipe(miBaraja.sacarNaipe());
        jugador1.agregarNaipe(miBaraja.sacarNaipe());
        dealer.agregarNaipe(miBaraja.sacarNaipe());

        // Quedarse con la mano
        boolean jugadorStays = jugador1.getJugadorStays();
        boolean dealerStays = false;

        int jugadorSuma = jugador1.sumaMano();
        int dealerSuma = dealer.sumaMano();
        
        //Turno jugador
//        System.out.println("Suma jugador --> "+jugadorSuma);
        while (jugadorSuma <= 21) {
            jugadorSuma = turnoJugador();
            jugadorStays = turnoJugadorBool();
            if (jugadorStays)
                break;
        }

//        System.out.println();
        // Turno del dealer
        
        if (jugadorSuma <= 21 && jugadorStays) {
            dealerSuma = turnoDealer(dealerStays, dealerSuma);
        }
        
//        System.out.println("\n");
//        jugador1.mostrarMano(true);
//        System.out.println("\tSUMA:  "+jugadorSuma);
//        dealer.mostrarMano(true);
//        System.out.println("\tSUMA:   "+dealerSuma);


//        System.out.println();
//
//        if (jugadorSuma == dealerSuma) {
//            System.out.println("Empate, se regresan las apuestas");
//        }
//        else if (dealerSuma>21 || jugadorSuma>dealerSuma && jugadorSuma<=21) {
//            System.out.println("\t\tJugador gana");
//                }
//        else if (dealerSuma<= 21 || jugadorSuma>21) {
//            System.out.println("\t\tLa casa gana");
//                }
//        
//        boolean terminaJuego = true;
        
        return jugadorGana(jugadorSuma, dealerSuma);

    } // Fin juego

    
    /**
     * Metodo para actualizar la suma de la mano del jugador.
     * @return La suma de la mano actual.
     */
    public int turnoJugador() {
               
        // Si el jugador pide
//        if (true) {
//
//             Agrega una carta y almacena si se paso
//
//            jugador1.mostrarMano(true);
//            jugadorSuma = jugador1.sumaMano();
//        } else {
//            jugadorStays = true;
//        }
        jugador1.actualizaSuma();
        return jugador1.getJugadorSuma();
    }
    
    /**
     * Metodo para actualizar si el jugador decide quedarse con su mano actual.
     * @return Si el jugador queda o no.
     */
    public boolean turnoJugadorBool() {
        return jugador1.getJugadorStays();
    }
     
//    public void pideCarta(boolean jugadorStays) {
//        
//        while (!jugadorStays && jugador1.sumaMano() <= 21) {
//            jugadorStays = !jugador1.agregarNaipe(miBaraja.sacarNaipe());
//        }
//            System.out.println("Carta! plz");
//            jugador1.mostrarMano(true);
//        
//        
//        //return jugadorStays;
//    }
    
    /**
     * Metodo para cuando se presiona el boton de pedir carta para el jugador.
     * @return un entero del valor de la suma del jugador.
     */
    public int pideCarta() {
        
        jugador1.agregarNaipe(miBaraja.sacarNaipe());

//        System.out.println("Carta! plz");
//        jugador1.mostrarMano(true);
        
//        jugador1.actualizaSuma();
//        System.out.println("Suma: "+jugador1.getJugadorSuma());

        
        //return jugadorStays;
        return jugador1.getJugadorSuma();
    }
    
    /**
     * Metodo para cuando se presiona el boton de quedar para el jugador.
     */
    public void queda() {
        jugador1.actualizaQueda(true);
//        System.out.println("Quedo");
//        System.out.println(jugador1.getJugadorStays());
    }
    
    /**
     * Metodo para cuando se presiona el boton de apostar para el jugador.
     * @param cantidad el numero entero de apuesta.
     */
    public void apostar(int cantidad) {
        int nuevoSaldo = jugador1.getSaldo();
        if(nuevoSaldo > 0 && nuevoSaldo >= cantidad) {
            nuevoSaldo -= cantidad;
            jugador1.actualizaSaldo(nuevoSaldo);
        }
        else
            System.out.println("Imposible apostar esa cantidad");
    }
    
    /**
     * Metodo para simular el turno del dealer.
     * @param dealerStays   Si el dealer se queda con su mano actual o no.
     * @param dealerSuma    La suma de la mano actual del dealer.
     * @return              La suma de la mano actual del dealer.
     */
    public int turnoDealer(boolean dealerStays, int dealerSuma) {
        while (!dealerStays) {
            if (dealer.sumaMano() < 17) {
//                System.out.println("\tSUMA: "+dealerSuma);
//                System.out.println("\tDealer pide");
                dealerStays = !dealer.agregarNaipe(miBaraja.sacarNaipe());
                dealer.mostrarMano(true);
                dealerSuma = dealer.sumaMano();
            } else {
//                System.out.println("Dealer queda");
                dealerStays = true;
            }

        }
        dealerSuma = dealer.sumaMano();
        return dealerSuma;
    }
    
    /**
     * Metodo para obtener la mano del jugador.
     * @return  La mano del jugador.
     */
    public ArrayList<Naipe> getManoJugador() {
        return jugador1.getMano();
    }
    
    /**
     * Metodo para obtener la mano del dealer.
     * @return  La mano del dealer.
     */
    public ArrayList<Naipe> getManoDealer() {
        return dealer.getMano();
    }
    
    /**
     * Metodo para determinar si el jugador gano.
     * @param jugadorSuma   La suma de la mano del jugador.
     * @param dealerSuma    La suma de la mano del dealer.
     * @return              Un entero que dictamina quien gano.
     */
    public int jugadorGana(int jugadorSuma, int dealerSuma) {
        if (jugadorSuma == dealerSuma) {
//            System.out.println("Empate, se regresan las apuestas");
            return 1;
        }
        else if (dealerSuma>21 || jugadorSuma>dealerSuma && jugadorSuma<=21) {
//            System.out.println("\t\tJugador gana");
            return 2;
        }
        else if (dealerSuma<= 21 || jugadorSuma>21) {
//            System.out.println("\t\tLa casa gana");
            return 3;
        }
        return 0;
    }
    
    /**
     * Metodo para obtener el saldo del jugador.
     * @return  El saldo del jugador.
     */
    public int getSaldoJugador() {
        return jugador1.getSaldo();
    }
    
    /**
     * Metodo para obtener al jugador.
     * @return  El jugador.
     */
    public Jugador getJugador() {
        return jugador1;
    }
    
    /**
     * Metodo para pagar al jugador si resulto ganador.
     */
    public void pagaJugador() {
        int value = jugadorGana(jugador1.getJugadorSuma(), dealer.getJugadorSuma());
        
        if (value==1) {
            jugador1.actualizaSaldo(1);
        } else if (value==2) {
            jugador1.actualizaSaldo(2);
        }
    }
    
    /**
     * Metodo para obtener al dealer.
     * @return  El dealer.
     */
    public Jugador getDealer() {
        return dealer;
    }
    
    
}
