/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionListeners;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * La clase Deteccion hereda de ActionListener y sobre escribe el método actionPerformed para cambiar el valor de su atributo booleano presionado.
 * El atributo booleano presionado indica si se activo un componente que tenga adicionado una instancia de esta clase, el atributo entero opcion
 * establece la opción respecitva del componente activado.
 * @author Equipo 2
 */
public class Deteccion implements ActionListener{
    
    private boolean presionado = false;
    private int opcion = -1;
    
    /**
     * recibe un evento al activarse el componente que esté escuchando y realiza unas instrucciones setBoton().
     * @param e evento que activo al componente
     */
    @Override
    public void actionPerformed(ActionEvent e){
        setBoton();
    }
    
    /**
     * El método setBoton cambia el valor del atributo presionado de false a true.
     */
    public void setBoton(){
        if(presionado==false)
            presionado = true;
    }
    /**
     * El método setBoton iguala el valor de presionado al booleano que recibe.
     * @param valor el valor booleano deseado para ponerselo al atributo presionado. 
     */
    public void setBoton(boolean valor){
        presionado = valor;
    }
    /**
     * El método setOpcion establece el valor para el atributo opcion de la clase.
     * @param n el número de opcion que corresponde al componente activado. 
     */
    public void setOpcion(int n){
        opcion = n;
    }
    
    /**
     * El geter correspondiente del atributo booleano presionado de la clase.
     * @return valor booleano del atributo presionado.
     */
    public boolean getBoton(){
        return presionado;
    }
    /**
     * El getter correspondiente del atributo entero opcion de la clase.
     * @return valor entero del atributo opcion.
     */
    public int getOpcion(){
        return this.opcion;
    }
    
}
