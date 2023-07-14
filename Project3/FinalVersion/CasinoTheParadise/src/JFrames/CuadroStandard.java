/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * La interfaz proporciona las medidas, títulos, colores y rutas necesarias para la interfaz gráfica generalizada del
 * Casino The Paradise además declara métodos necesarios en todas las ventanas JFrames instanciadas para que se sobreescriban.
 * @author Equipo 2
 */
public interface CuadroStandard {
    final int ANCHO = 800;
    final int LARGO = 600;
    final String TITULO = "Casino The Paradise";
    final String RUTA_ICONO = "/Imagenes/LogoDadoAzul.png";
    final Color COLOR_FONDO = new Color(0, 32, 96);
    
    /**
     * Método que se deberá encargar de poner el ícono de la ventana JFrame emergente.
     * @param ruta la ruta relativa del ícono deseado.
     */
    public void establecerIcono(String ruta);
    /**
     * Método para cambiar el panel que se está desplegando/mostrando en la ventana actual.
     * @param panel la instancia del nuevo panel a mostrar.
     */
    public void cambiarPanel(JPanel panel);
    /**
     * Método para mostrar al usuario el panel actual. Volverlo visible.
     */
    public void desplegar();
    /**
     * Método para dejar de mostrar al usuario el panel actual. Volverlo invisible.
     */
    public void esconder();
    /**
     * Método para cerrar el hilo y ventan actual.
     */
    public void cerrar();
}
