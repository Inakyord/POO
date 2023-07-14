/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tragamonedas;

import java.util.Random;
import javax.swing.SwingWorker;
/**
 * @author http://www.jc-mouse.net/
 * @author Mouse
 */
public class Casilla extends SwingWorker<Integer, Void>{

    private Figuras jfigura;
    private int value=0;
    private int wait = 6; //milisegundos
    
    /** Constructor de clase */
    Casilla(Figuras jc)
    {
        jfigura = jc;        
    }    
     
    @Override
    protected Integer doInBackground() throws Exception {
        int giros=0;        
        Random random = new Random();
        int n  = random.nextInt(3) + 1;
        int rotate  = random.nextInt(7) + 4;
        while( giros < rotate)//rotacion
        {
            giros++;
            value = 0;            
            for(int i=0;i<( n*10 );i++)
            {
                value -=10;
                jfigura.updateY(value);    
                Thread.sleep(wait);                       
            }         
            wait +=2;
        }                   
        return value;
    }
    
}

