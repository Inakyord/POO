/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;

import java.applet.AudioClip;

public class Reproductor extends Thread  {
    public static boolean x = true; 
    public static int b = 0;
    
    @Override
    public void run(){
    AudioClip Sound;
    Sound = java.applet.Applet.newAudioClip(getClass().getResource("/carreracaballos/Ccaballos.wav"));
    Sound.play();
      try {

             Thread.sleep(43000);

       } catch (InterruptedException e) {

       }
    Sound.stop(); 
        
    
    
    
    }
}
