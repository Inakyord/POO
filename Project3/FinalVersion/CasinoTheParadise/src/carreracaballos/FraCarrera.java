/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;

import JFrames.CuadroStandard;
import javax.swing.JLabel;
import Persona.Cliente.Cliente;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import ActionListeners.Deteccion;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import Casino.Casino;

/**
 * La clase FraCarrera es la que contiene todos lo referente a la interfaz grafica de la carrera de caballos.
 * @author Equipo 2
 */
public class FraCarrera extends JFrame implements CuadroStandard{

    
    Deteccion detector;
    Cliente jugador;
    Casino casino;
    static public int apu,sele;
    /**
     * Constructor único de la clase FraCarrera.
     * Establece todos los datos que utilizaremos para la carrera y hace invicible a los botones
     */
    public FraCarrera() {
        initComponents();
        apu = 0;
        Apuesta.setText(String.valueOf(apu));
        establecerIcono(RUTA_ICONO);
        setSize(ANCHO, LARGO);
        setTitle(TITULO);
        getContentPane().setBackground(COLOR_FONDO);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setPreferredSize(new Dimension(ANCHO, LARGO));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        jButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        butinici.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        butinici.setOpaque(false);
        butinici.setContentAreaFilled(false);
        butinici.setBorderPainted(false);
    }
    
     /**
     * Setter del atributo dtector.
     * @param detector valor del atributo detector.
     */
    public void setDetector(Deteccion detector){
        this.detector = detector;
    }
     /**
     * Setter del atributo poker.
     * @param jugador valor para el atributo jugador.
     */
    public void setJugador(Cliente jugador) {
        this.jugador = jugador;
        Credito.setText(String.valueOf(jugador.fichas));
    }
     /**
     * Setter del atributo casino.
     * @param casino valor para el atributo casino.
     */
    public void setCasino(Casino casino){
        this.casino = casino;
    }
     /**
     * Funcion que establece el icono del casino.
     */
    @Override
    public void establecerIcono(String ruta){
        Image icon = new ImageIcon(getClass().getResource(ruta)).getImage();
        this.setIconImage(icon);
    }
     /**
     * Funcion que establece el icono del casino.
     */
    @Override
    public void desplegar(){
        this.setVisible(true);
    }
     /**
     * Funcion que esconde el panel.
     */
    @Override
    public void esconder(){
        this.setVisible(false);
    }
     /**
     * Funcion que cierra la ventana.
     */
    @Override
    public void cerrar(){
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
     /**
     * Funcion que cambia el panel.
     */
    @Override
    public void cambiarPanel(JPanel panel){
        setContentPane(panel);
        repaint();
        revalidate();
    }
    /**
     * Getter del atributo JLabel lbl1.
     * @return el valor del atributo lbl1.
     */
    public JLabel getlbl1() {
        return lbl1;
    }
    /**
     * Getter del atributo JLabel lbl2.
     * @return el valor del atributo lbl2.
     */
    public JLabel getlbl2() {
        return lbl2;
    }
    /**
     * Getter del atributo JLabel lbl3.
     * @return el valor del atributo lbl3.
     */
    public JLabel getlbl3() {
        return lbl3;
    }
    /**
     * Getter del atributo JLabel lbl4.
     * @return el valor del atributo lbl4.
     */
    public JLabel getlbl4() {
        return lbl4;
    }
    /**
     * Getter del atributo JLabel lbl5.
     * @return el valor del atributo lbl5.
     */
    public JLabel getlbl5() {
        return lbl5;
    }
    /**
     * Getter del atributo JLabel lbl_barrera.
     * @return el valor del atributo lbl_barrera.
     */
    public JLabel getlbl_barrera() {
        return lblbarr;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        butinici = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lblbarr = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Apuesta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Credito = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("10");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("100");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("1000");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Inicio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/binicio.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        butinici.setText("INICIAR CARRERA");
        butinici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butiniciActionPerformed(evt);
            }
        });
        jPanel1.add(butinici, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 80, 80));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel1.setText("CARRERA DE CABALLOS \"THE Paradise\"");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 590, 70));

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/cabaca1.png"))); // NOI18N
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/cabaca2.png"))); // NOI18N
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/cabaca3.png"))); // NOI18N
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/cabaca4.png"))); // NOI18N
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/cabaca5.png"))); // NOI18N
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        lblbarr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 10));
        jPanel1.add(lblbarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 10, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/caballospro.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, 410));

        Apuesta.setBackground(new java.awt.Color(204, 0, 0));
        Apuesta.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        Apuesta.setForeground(new java.awt.Color(153, 0, 0));
        Apuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Apuesta.setText("jLabel3");
        jPanel1.add(Apuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 130, 40));

        jLabel4.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apuesta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 130, 40));

        jLabel6.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Credito:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        Credito.setBackground(new java.awt.Color(204, 0, 0));
        Credito.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        Credito.setForeground(new java.awt.Color(153, 0, 0));
        Credito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Credito.setText("jLabel3");
        jPanel1.add(Credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 130, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/apuesta.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/apuesta.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carreracaballos/apuesta.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 505, 80, 70));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 505, -1, 70));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 505, -1, 70));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1 \"Spirit\"", "Caballo 2 \"Viernes\"", "Caballo 3 \"Bojack\"", "Caballo 4 \"Secretariat\"", "Caballo 5 \"Ivan\"" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 240, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * Metodo para iniciar el juego de Carrera de caballos.
     */
    private void butiniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butiniciActionPerformed
        // TODO add your handling code here:
        butinici.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        lbl1.setLocation(40, lbl1.getLocation().y);
        lbl2.setLocation(40, lbl2.getLocation().y);
        lbl3.setLocation(40, lbl3.getLocation().y);
        lbl4.setLocation(40, lbl4.getLocation().y);
        lbl5.setLocation(40, lbl5.getLocation().y);
        sele = jComboBox1.getItemCount();
        Reproductor re = new Reproductor();
        Carrera hilo1 = new Carrera(lbl1, this, detector,jugador,casino);
        Carrera hilo2 = new Carrera(lbl2, this, detector,jugador,casino);
        Carrera hilo3 = new Carrera(lbl3, this, detector,jugador,casino);
        Carrera hilo4 = new Carrera(lbl4, this, detector,jugador,casino);
        Carrera hilo5 = new Carrera(lbl5, this, detector,jugador,casino);
        re.start();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

    }//GEN-LAST:event_butiniciActionPerformed
     /**
     * Metodo para apostar 10 fichas.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                apu = apu + 10;
        if ((((float)(100 * apu) / jugador.fichas)) <= (jugador.apuestaMax * 100)) {
            if (apu <= jugador.fichas) {
                Apuesta.setText(String.valueOf(apu));
                repaint();
            } else {
                apu = apu - 10;
                JOptionPane.showMessageDialog(this, "Credito insuficiente!");
            }
        } else {
            apu = apu - 10;
            JOptionPane.showMessageDialog(this, "Llego a su limite de apuesta!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
     /**
     * Metodo para apostar 100 fichas.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                apu = apu + 100;
        if ((((float)(100 * apu) / jugador.fichas)) <= (jugador.apuestaMax * 100)) {
            if (apu <= jugador.fichas) {
                Apuesta.setText(String.valueOf(apu));
                repaint();
            } else {
                apu = apu - 100;
                JOptionPane.showMessageDialog(this, "Credito insuficiente!");
            }
        } else {
            apu = apu - 100;
            JOptionPane.showMessageDialog(this, "Llego a su limite de apuesta!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

     /**
     * Metodo para apostar 1000 fichas.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        apu = apu + 1000;
        if ((((float)(100 * apu) / jugador.fichas)) <= (jugador.apuestaMax * 100)) {
            if (apu <= jugador.fichas) {
                Apuesta.setText(String.valueOf(apu));
                repaint();
            } else {
                apu = apu - 1000;
                JOptionPane.showMessageDialog(this, "Credito insuficiente!");
            }
        } else {
            apu = apu - 1000;
            JOptionPane.showMessageDialog(this, "Llego a su limite de apuesta!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
     /**
     * Metodo main solo se usa para probar el panel independientemente.
     * @param args pasados al método main.
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FraCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            
        //}

    }
     /**
     * Metodo para ainiciar el programa desde afuera.
     */
    public void run() {
                new FraCarrera().setVisible(true);
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apuesta;
    private javax.swing.JLabel Credito;
    private javax.swing.JButton butinici;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblbarr;
    // End of variables declaration//GEN-END:variables
}
