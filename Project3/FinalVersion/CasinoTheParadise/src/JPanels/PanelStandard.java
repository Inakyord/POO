/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels;

/**
 * La interfaz PanelStandard proporciona las medidas del formato de los paneles para mostrar dentro de un JFrame.
 * Además declara el método setBackground para forzar a su sobre escritura en los métodos.
 * @author Equipo 2
 */
public interface PanelStandard {
    final int ANCHO = 800;
    final int LARGO = 600;
    
    /**
     * El metodo setBackground es el encargado de cambiar la imagen del fondo del panel mostrado para hacer mejores interfaces gráficas.
     */
    public void setBackground();
}
