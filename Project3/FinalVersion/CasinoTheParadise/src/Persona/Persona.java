/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Excepciones.CorreoInvalidoException;
import Excepciones.LongitudNombreException;
import Excepciones.LongitudApellidoException;
import java.io.Serializable;

/**
 * La clase Persona es la abstracción de la información de una persona, tiene atributos del nombre nombre, apellido, edad, genero correo y
 * contraseña. Implementa la interfaz Serialiable para poder guardar en archivos objeto.
 * @author Equipo 2
 */
public class Persona implements Serializable{
    
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String correo;
    private String contra;
    
    /**
     * Setter del atributo nombre.
     * @param nombre valor para el atributo nombre.
     * @throws Excepciones.LongitudNombreException la excepcion de incumplimiento de longitud.
     */
    public void setNombre(String nombre) throws LongitudNombreException{
        if(nombre.length()<3 || nombre.length()>15)
            throw new LongitudNombreException();
        this.nombre = nombre;
    }
    /**
     * Setter del atributo apellido.
     * @param apellido valor para el atributo apellido.
     * @throws Excepciones.LongitudApellidoException la excepcion de incumplimiento de longitud.
     */
    public void setApellido(String apellido) throws LongitudApellidoException{
        if(apellido.length()<3 || apellido.length()>15)
            throw new LongitudApellidoException();
        this.apellido = apellido;
    }
    /**
     * Setter del atributo edad.
     * @param edad valor para el atributo edad. 
     */
    public void setEdad(int edad){
        this.edad = edad;
    }
    /**
     * Setter del atributo genero.
     * @param genero valor para el atributo genero. 
     */
    public void setGenero(String genero){
        this.genero = genero;
    }
    /**
     * Setter del atributo correo.
     * @param correo valor para el atributo correo.
     * @throws Excepciones.CorreoInvalidoException la excepcion de correo inválido, no tiene arroba.
     */
    public void setCorreo(String correo) throws CorreoInvalidoException{
        if(correo.indexOf('@')==-1){
            throw new CorreoInvalidoException();
        }
        this.correo = correo;
    }
    /**
     * Setter del atributo contra.
     * @param contra valor para el atributo contra. 
     */
    public void setContra(String contra){
        this.contra = contra;
    }
    
    /**
     * Getter del atributo nombre.
     * @return el valor del atributo nombre.
     */
    private String getNombre(){
        return nombre;
    }
    /**
     * Getter del atributo apellido.
     * @return el valor del atributo apellido.
     */
    private String getApellido(){
        return apellido;
    }
    /**
     * Getter del atributo edad.
     * @return el valor del atributo edad.
     */
    private int getEdad(){
        return edad;
    }
    /**
     * Getter del atributo genero.
     * @return el valor del atributo genero.
     */
    private String getGenero(){
        return genero;
    }
    /**
     * Getter del atributo correo.
     * @return el valor del atributo correo.
     */
    private String getCorreo(){
        return correo;
    }
    
    /**
     * el método compararContra se encarga de corroborar que la contraseña coincida con la del usuario.
     * @param contra la contraseña a comparar con la original
     * @return valor booleano que indica si la contaseña coincide
     */
    public boolean compararContra(String contra){
        return this.contra.compareTo(contra)==0;
    }
    
    /**
     * El método obtenerDatos obtiene los valores de los atributos del usuario a pesar de los modificadores de acceso.
     * @return un arreglo de String con los datos del usuario.
     */
    public String[] obtenerDatos(){
        String[] datos = new String[7];
        datos[2] = getNombre();
        datos[3] = getApellido();
        datos[4] = String.valueOf(getEdad());
        datos[5] = getGenero();
        datos[6] = getCorreo();
        return datos;
    }
    
    @Override
    public String toString(){
        String datos;
        datos  = "\n Nombre: "+getNombre();
        datos += "\n Apellido: "+getApellido();
        datos += "\n Edad: "+getEdad();
        datos += "\n Genero: "+getGenero();
        datos += "\n Email: "+getCorreo();
        return datos;
    }
}
