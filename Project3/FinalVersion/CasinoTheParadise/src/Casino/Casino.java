/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import java.io.Serializable;

/**
 * La clase Casino es la abstracción de la información de un casino tiene atributos del nombre del casino, sus ganancias totales,
 * las ganancias por juego y el número de usuarios totales. Implementa la interfaz Serialiable para poder guardar en archivos objeto.
 * @author Equipo 2
 */
public class Casino implements Serializable{
    
    private String nombre;
    private int total;
    private int caballos;
    private int poker;
    private int blackjack;
    private int tragamonedas;
    public int usuarios;
    
    /**
     * Constructor único de la clase Casino.
     * @param nombre el nombre del casino que representa la instancia
     */
    public Casino(String nombre){
        setNombre(nombre);
        setTotal(0);
        setCaballos(0);
        setPoker(0);
        setBlackjack(0);
        setTragamonedas(0);
        usuarios = 0;
    }
    
    /**
     * Getter del atributo nombre.
     * @return el valor del atributo nombre.
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Getter del atributo total.
     * @return el valor del atributo total.
     */
    private int getTotal(){
        return total;
    }
    /**
     * Getter del atributo entero caballos.
     * @return el valor del atributo caballos.
     */
    private int getCaballos(){
        return caballos;
    }
    /**
     * Getter del atributo entero poker.
     * @return el valor del atributo poker.
     */
    private int getPoker(){
        return poker;
    }
    /**
     * Getter del atributo entero blackjack.
     * @return el valor del atributo blackjack.
     */
    private int getBlackjack(){
        return blackjack;
    }
    /**
     * Getter del atributo entero tragamonedas.
     * @return el valor del atributo tragamonedas.
     */
    private int getTragamonedas(){
        return tragamonedas;
    }
    
    /**
     * Setter del atributo nombre.
     * @param nombre valor para el atributo nombre.
     */
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Setter del atributo total.
     * @param total valor para el atributo total.
     */
    protected void setTotal(int total){
        this.total = total;
    }
    /**
     * Setter del atributo caballos.
     * @param caballos valor para el atributo caballos.
     */
    protected void setCaballos(int caballos){
        this.caballos = caballos;
    }
    /**
     * Setter del atributo poker.
     * @param poker valor para el atributo poker.
     */
    protected void setPoker(int poker){
        this.poker = poker;
    }
    /**
     * Setter del atributo total.
     * @param blackjack valor para el atributo blackjack.
     */
    protected void setBlackjack(int blackjack){
        this.blackjack = blackjack;
    }
    /**
     * Setter del atributo tragamonedas.
     * @param tragamonedas valor para el atributo tragamonedas.
     */
    protected void setTragamonedas(int tragamonedas){
        this.tragamonedas = tragamonedas;
    }
    
    /**
     * Método para sumar al atributo total y al caballos.
     * @param suma la cantida a sumar. (Positiva para suma, negativa para resta)
     */
    public void sumaCaballos(int suma){
        caballos+=suma;
        total+=suma;
    }
    /**
     * Método para sumar al atributo total y al poker.
     * @param suma la cantida a sumar. (Positiva para suma, negativa para resta)
     */
    public void sumaPoker(int suma){
        poker+=suma;
        total+=suma;
    }
    /**
     * Método para sumar al atributo total y al blackjack.
     * @param suma la cantida a sumar. (Positiva para suma, negativa para resta)
     */
    public void sumaBlackjack(int suma){
        blackjack+=suma;
        total+=suma;
    }
    /**
     * Método para sumar al atributo total y al tragamonedas.
     * @param suma la cantida a sumar. (Positiva para suma, negativa para resta)
     */
    public void sumaTragamonedas(int suma){
        tragamonedas+=suma;
        total+=suma;
    }
    
    @Override
    public String toString(){
        String datos;
        datos = "     \"Casino The Paradise\" ";
        datos+= "\n\n Número de usuarios: "+this.usuarios;
        datos+= "\n\n Ganancias totales: $ "+getTotal();
        datos+= "\n\n\n DESGLOSE:\n";
        datos+= "\n Ganancia Caballos: \t$ "+getCaballos();
        datos+= "\n Ganancia Poker: \t$ "+getPoker();
        datos+= "\n Ganancia Blackjack: \t$ "+getBlackjack();
        datos+= "\n Ganancia Tragamonedas: $ "+getTragamonedas();
        datos+= "\n\n ------CORTE Al MOMENTO------";
        
        return datos;
    }
    
    
}
