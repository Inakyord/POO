/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradise_cartas_v3.poker;

import java.util.ArrayList;
import paradise_cartas_v3.cartas.Baraja;
import paradise_cartas_v3.cartas.Naipe;

/**
 * Clase para simular el juego de poker.
 * @author Equipo 2
 */
public class Poker {
    
    private static Baraja laBaraja = new Baraja(1, true);
    private ArrayList<Naipe> disposed = new ArrayList<>();
    private static JugadorPoker cliente = new JugadorPoker("Palatio", 1000);
    private static JugadorPoker oponente1 = new JugadorPoker("Oponente",10000000);
    private static JugadorPoker dealer = new JugadorPoker("Dealer");
    private int pozo = 0;
    private int smallBlindCantidad = 1;
    private int bigBlindCantidad = 2;
    private int turno = 1;
    
    public void iniciaPoker() {
        checaBlinds();
        cliente.agregarNaipe(laBaraja.sacarNaipe());
        cliente.agregarNaipe(laBaraja.sacarNaipe());
        oponente1.agregarNaipe(laBaraja.sacarNaipe());
        oponente1.agregarNaipe(laBaraja.sacarNaipe());
        System.out.println("Inicia");
        cliente.mostrarMano(true);
    }
    
    public void primeraRonda() {
        checaBlinds();
        disposed.add(laBaraja.sacarNaipe());
        dealer.agregarNaipe(laBaraja.sacarNaipe());
        dealer.agregarNaipe(laBaraja.sacarNaipe());
        dealer.agregarNaipe(laBaraja.sacarNaipe());
    }
    
    public void segundaRonda() {
        disposed.add(laBaraja.sacarNaipe());
        dealer.agregarNaipe(laBaraja.sacarNaipe());
    }
    
    public void terceraRonda() {
        disposed.add(laBaraja.sacarNaipe());
        dealer.agregarNaipe(laBaraja.sacarNaipe());
    }
    
    public void rondaApuestas() {
        // Oponente1 siempre checará, igualando si el cliente aumenta
        
    }
    
    public void checaBlinds() {
        if(turno%2 == 0) {
            smallBlind();
            //System.out.println("oponente big");
        } else {
            bigBlind();
            //System.out.println("oponente small");
        }
        turno++;
    }
    
    public void smallBlind() {
        pozo += smallBlindCantidad;
        cliente.apuestaBase(smallBlindCantidad);
    }
    
    public void bigBlind() {
        pozo += bigBlindCantidad;
        cliente.apuestaBase(bigBlindCantidad);
    }
    
    public void apuesta(int cantidadApostar) {
        cliente.actualizaSaldo(cliente.getSaldo()-cantidadApostar);
        System.out.println("Apuesta");
    }
    
    public void aumenta() {
        System.out.println("Aumenta");
    }
    
    public void checa() {
        System.out.println("Checa");
    }
    
    public JugadorPoker getCliente() {
        return cliente;
    }
    
    public JugadorPoker getOponente() {
        return oponente1;
    }
    
    public JugadorPoker getDealer() {
        return dealer;
    }
    
    public ArrayList<Naipe> getManoCliente() {
        return cliente.getMano();
    }
    
    public ArrayList<Naipe> getManoOponente() {
        return oponente1.getMano();
    }
    
    public ArrayList<Naipe> getManoDealer() {
        return dealer.getMano();
    }
    
}
