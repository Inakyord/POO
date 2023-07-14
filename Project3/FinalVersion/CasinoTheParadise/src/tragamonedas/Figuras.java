package tragamonedas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
/**
 * Funcion que introduce la imagen al panel
 * @author Equipo 2
 */
public class Figuras extends JComponent {
    
    private ImageIcon image= new ImageIcon( getClass().getResource("/tragamonedas/figuras.jpg"));           
    private int y=0;
    private Dimension d = new Dimension(65,100);
    
    /** Constructor de clase */
    Figuras()
    {
        setSize(d);
        setPreferredSize(d);
        setVisible(true);
    }
    
    /** Actualiza coordenada en Y 
     * @param value el valor que actualiza
     */
    public void updateY(int value)
    {
        y = value;
        repaint();
    }
    
    @Override
    public void paint (Graphics g){
        super.paint(g);
        g.drawImage(image.getImage(), 0, y, 65, 400, this);                
	g.dispose();
    }
 
}
