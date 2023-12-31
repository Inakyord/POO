/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import ActionListeners.Deteccion;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JOptionPane;
import Persona.Cliente.Cliente;
import Excepciones.*;
import Principal.ManejoArchivos;
import java.awt.Cursor;

/**
 * Clase que hereda de JPanel y despliega en ella la interfaz del menú del registro del jugador.
 * @author Equipo 2
 */
public class PanelRegistro extends JPanel implements PanelStandard{

    private Image background;
    private final Deteccion detector;
    private Cliente cliente;
    private final ManejoArchivos archivos = new ManejoArchivos();
    
    /**
     * Constrctor único de la clase PanelRegistro, crea una instancia nueva de la clase.
     * @param detector la instancia de ActionListener que "escucha" la activación de los componentes (botones).
     */
    public PanelRegistro(Deteccion detector) {
        initComponents();
        this.detector = detector;
        jButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton1.addActionListener(detector);
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton2.addActionListener(detector);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        
        sliderEdad.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent ce) {
            jLabel9.setText(String.valueOf(sliderEdad.getValue()));
         }
        });
        
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        int width = this.getSize().width;
        int height = this.getSize().height;
        
        if(this.background != null){
            g.drawImage(this.background, 0, 0, width, height, null);
        }else{
            setBackground();
        }
        super.paintComponent(g);
    }
    
    @Override
    public void setBackground(){
        this.setOpaque(false);
        this.background = new ImageIcon(getClass().getResource("/Imagenes/Registro.png")).getImage();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textoApodo = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        textoCorreo = new javax.swing.JTextField();
        textoContra = new javax.swing.JTextField();
        cajaMembresia = new javax.swing.JComboBox<>();
        cajaGenero = new javax.swing.JComboBox<>();
        sliderEdad = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de membresía:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apodo para casino:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Genero:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edad:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        textoApodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoApodo.setMaximumSize(new java.awt.Dimension(315, 25));
        textoApodo.setMinimumSize(new java.awt.Dimension(315, 25));
        textoApodo.setPreferredSize(new java.awt.Dimension(315, 25));

        textoNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoNombre.setMaximumSize(new java.awt.Dimension(315, 25));
        textoNombre.setMinimumSize(new java.awt.Dimension(315, 25));
        textoNombre.setPreferredSize(new java.awt.Dimension(315, 25));

        textoApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoApellido.setMaximumSize(new java.awt.Dimension(315, 25));
        textoApellido.setMinimumSize(new java.awt.Dimension(315, 25));
        textoApellido.setPreferredSize(new java.awt.Dimension(315, 25));

        textoCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoCorreo.setMaximumSize(new java.awt.Dimension(315, 25));
        textoCorreo.setMinimumSize(new java.awt.Dimension(315, 25));
        textoCorreo.setPreferredSize(new java.awt.Dimension(315, 25));

        textoContra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoContra.setMaximumSize(new java.awt.Dimension(315, 25));
        textoContra.setMinimumSize(new java.awt.Dimension(315, 25));
        textoContra.setPreferredSize(new java.awt.Dimension(315, 25));

        cajaMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diamante - $1000  (Todos los juegos - apuestas libres - Bono 2.5)", "Oro - $500  (Todos los juegos - 90% apuesta - Bono 2.0)", "Plata - $200  (Juegos Limitados - 50% apuesta - Bono 1.5)" }));

        cajaGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "No Binario" }));

        sliderEdad.setMajorTickSpacing(1);
        sliderEdad.setMinimum(18);
        sliderEdad.setMinorTickSpacing(1);
        sliderEdad.setPaintTicks(true);
        sliderEdad.setValue(18);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("18");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("jLabel10");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("jLabel11");
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("jLabel12");
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("jLabel13");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoApodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaMembresia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoApodo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(sliderEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cajaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel13)))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7))
                    .addComponent(textoContra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        textoApodo.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoContra.setText("");
        textoCorreo.setText("");
        sliderEdad.setValue(18);
        cajaMembresia.setSelectedIndex(0);
        cajaGenero.setSelectedIndex(0);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        detector.setOpcion(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente();
        int tipo = cajaMembresia.getSelectedIndex();
        String membresia = "";
        int genero = cajaGenero.getSelectedIndex();
        String textoGenero = "";
        switch(tipo){
            case 0:
                membresia = "Diamante";
                break;
            case 1:
                membresia = "Oro";
                break;
            case 2:
                membresia = "Plata";
                break;
        }
        switch(genero){
            case 0:
                textoGenero = "Masculino";
                break;
            case 1:
                textoGenero = "Femenino";
                break;
            case 2:
                textoGenero = "No Binario";
                break;
        }
        
        try{
            if(textoApodo.getText().compareTo("")==0 || textoNombre.getText().compareTo("")==0 || textoApellido.getText().compareTo("")==0 || textoCorreo.getText().compareTo("")==0 ||
                    textoContra.getText().compareTo("")==0)
                throw new DatoVacioException();
            
            cliente.setApodo(textoApodo.getText());
            jLabel10.setVisible(false);
            cliente.setRango(membresia);
            cliente.setNombre(textoNombre.getText());
            jLabel11.setVisible(false);
            cliente.setApellido(textoApellido.getText());
            jLabel12.setVisible(false);
            cliente.setGenero(textoGenero);
            cliente.setEdad(sliderEdad.getValue());
            cliente.setCorreo(textoCorreo.getText());
            jLabel13.setVisible(false);
            cliente.setContra(textoContra.getText());
            
            textoApodo.setText("");
            textoNombre.setText("");
            textoApellido.setText("");
            textoContra.setText("");
            textoCorreo.setText("");
            sliderEdad.setValue(18);
            cajaMembresia.setSelectedIndex(0);
            cajaGenero.setSelectedIndex(0);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            
            detector.setOpcion(1);
            archivos.guardarUsuario(cliente);
            JOptionPane.showMessageDialog(this, "Registro fue exitoso.");
            
        }catch(DatoVacioException e){
            detector.setOpcion(10);
            JOptionPane.showMessageDialog(this, "No puede dejar ningún campo vacío!!!");
        }catch(ApodoUsadoException e){
            jLabel10.setText("Apodo usado.");
            jLabel10.setVisible(true);
            detector.setOpcion(10);
            JOptionPane.showMessageDialog(this, "Registro no posible, apodo usado.");
        }catch(ApodoInvalidoException e){
            jLabel10.setText("Apodo inválido.");
            jLabel10.setVisible(true);
            detector.setOpcion(10);
            JOptionPane.showMessageDialog(this, "Registro no posible, apodo inválido.\nChar inválido: ñ\\/:*?\"<>|\nLongitud: [2-10]");
        }catch(LongitudNombreException e){
            jLabel11.setText("Longitud inválida.");
            jLabel11.setVisible(true);
            detector.setOpcion(10);
            JOptionPane.showMessageDialog(this, "Registro no posible, longitud nombre inválida [3-15].");
        }catch(LongitudApellidoException e){
            jLabel12.setText("Longitud inválida.");
            jLabel12.setVisible(true);
            detector.setOpcion(10);
            JOptionPane.showMessageDialog(this, "Registro no posible, longitud apellido inválida [3-15].");
        }catch(CorreoInvalidoException e){
            jLabel13.setText("Correo inválido.");
            jLabel13.setVisible(true);
            detector.setOpcion(10);
            JOptionPane.showMessageDialog(this, "Registro no posible, correo inválido.");
        }
        
        repaint();
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cajaGenero;
    private javax.swing.JComboBox<String> cajaMembresia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider sliderEdad;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoApodo;
    private javax.swing.JTextField textoContra;
    private javax.swing.JTextField textoCorreo;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
