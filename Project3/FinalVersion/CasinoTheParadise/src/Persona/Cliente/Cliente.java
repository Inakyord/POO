/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.Cliente;

import Persona.Persona;
import java.io.Serializable;
import Principal.ManejoArchivos;
import Excepciones.*;

/**
 * La clase Cliente es la abstracción de la información de un usuario del casino, hereda de la clase Persona y se le añaden atributos 
 * como su apodo (nombre de usuario), rango de membresía, fichas actuales y datos de sus posibles apuestas.
 * Implementa la interfaz Serialiable para poder guardar en archivos objeto.
 * @author Equipo 2
 */
public class Cliente extends Persona implements Serializable{
    
    String apodo;
    String rango;
    public int fichas;
    public float bono;
    public float apuestaMax;
    final private ManejoArchivos archivos = new ManejoArchivos();
    
    /**
     * Setter del atributo apodo.
     * @param apodo valor para el atributo apodo.
     * @throws Excepciones.ApodoUsadoException la excepcion de apodo ya usado.
     * @throws Excepciones.ApodoInvalidoException la excepcion de un apodo no válido.
     */
    public void setApodo(String apodo) throws ApodoUsadoException, ApodoInvalidoException{
        if(apodo.length()>10 || apodo.length()<2 || apodo.indexOf('\\')!=-1 || apodo.indexOf('/')!=-1 || apodo.indexOf(':')!=-1 ||apodo.indexOf('*')!=-1 ||apodo.indexOf('?')!=-1 ||apodo.indexOf('\"')!=-1 ||
                apodo.indexOf('<')!=-1 ||apodo.indexOf('>')!=-1 ||apodo.indexOf('|')!=-1 ||apodo.indexOf('ñ')!=-1){
            throw new ApodoInvalidoException();
        }else if(archivos.buscarUsuario(apodo))
            throw new ApodoUsadoException();
        else{
            this.apodo = apodo;
        }
    }
    /**
     * Setter del atributo rango que además establece otras variables según el rango.
     * @param rango valor para el atributo rango.
     */
    public void setRango(String rango){
        this.rango = rango;
        if(rango.compareTo("Diamante")==0){
            bono = 1.5f;
            apuestaMax = 1f;
            fichas = 750;
        }else if(rango.compareTo("Oro")==0){
            bono = 1.0f;
            apuestaMax= 0.9f;
            fichas = 250;
        }else{
            bono = 0.5f;
            apuestaMax = 0.5f;
            fichas = 50;
        }
    }
    
    /**
     * Getter del atributo apodo.
     * @return el valor del atributo apodo.
     */
    public String getApodo(){
        return apodo;
    }
    /**
     * Getter del atributo rango.
     * @return el valor del atributo rango.
     */
    public String getRango(){
        return rango;
    }
    /**
     * Getter del atributo fichas.
     * @return el valor del atributo fichas.
     */
    public int getFichas(){
        return fichas;
    }
    
    @Override
    public String[] obtenerDatos(){
        String[] datos;
        datos = super.obtenerDatos();
        datos[0] = getApodo();
        datos[1] = getRango();
        return datos;
    }
    
    @Override
    public String toString(){
        String datos;
        datos  = "\n Información del Jugador.\n";
        datos += "\n Apodo: "+getApodo();
        datos += "\n Membresía: "+getRango();
        datos += super.toString();
        datos += "\n\n FICHAS: $ "+getFichas();
        return datos;
    }
}
