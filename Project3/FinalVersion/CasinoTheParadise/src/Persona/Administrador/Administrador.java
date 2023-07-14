/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.Administrador;

import Persona.Persona;
import Persona.Cliente.Cliente;
import Excepciones.*;
import Principal.ManejoArchivos;
import java.io.Serializable;

/**
 * La clase Administrador es la abstracción de la información de un administrador del casino, hereda de la clase Persona y añade atributos
 * como apodo y una instancia jugador para poderla manejar al igual que una instancia de MAnejoArchivos para poder guardar las ediciones de un
 * jugador. Implementa la interfaz Serialiable para poder guardar en archivos objeto.
 * @author Equipo 2
 */
public class Administrador extends Persona implements Serializable{
    
    public Cliente jugador;
    private String apodo;
    final private ManejoArchivos archivos = new ManejoArchivos();
    
    /**
     * Getter del atributo apodo.
     * @return el valor del atributo apodo.
     */
    public String getApodo(){
        return apodo;
    }
    
    /**
     * Setter del atributo apodo.
     * @param apodo valor para el atributo apodo.
     * @throws Excepciones.ApodoUsadoException la excepcion que indica del nombre ya registrado.
     * @throws Excepciones.ApodoInvalidoException la excepcion que indica un nombre no válido.
     */
    public void setApodo(String apodo) throws ApodoUsadoException, ApodoInvalidoException{
        if(apodo.length()>10 || apodo.length()<2 || apodo.indexOf('\\')!=-1 || apodo.indexOf('/')!=-1 || apodo.indexOf(':')!=-1 ||apodo.indexOf('*')!=-1 ||apodo.indexOf('?')!=-1 ||apodo.indexOf('\"')!=-1 ||
                apodo.indexOf('<')!=-1 ||apodo.indexOf('>')!=-1 ||apodo.indexOf('|')!=-1 ||apodo.indexOf('ñ')!=-1){
            throw new ApodoInvalidoException();
        }else if(archivos.buscarAdmin(apodo))
            throw new ApodoUsadoException();
        else{
            this.apodo = apodo;
        }
    }
    
}
