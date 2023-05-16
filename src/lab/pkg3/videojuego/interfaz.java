/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab.pkg3.videojuego;

/**
 *
 * @author Cristian
*/
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class interfaz extends javax.swing.JFrame {
    Random r = new Random();
    preguntas p = new preguntas();
    int n = r.nextInt(p.preguntas.size());
    int n_p = 0;
    String jugador;
    
    Timer t;
    ActionListener ac;

    public interfaz() {
       
        
        initComponents();
        poder_1.setText("SALVAR");
        poder_1.setFont(new Font("Arial", Font.BOLD, 9));
        pregunta.setText("<html>"+p.preguntas.get(n).get(0)+"</br>");
        pregunta.setForeground(Color.WHITE);
        pregunta.setFont(new Font("Arial", Font.BOLD, 20));
        pregunta.setBounds(53, 20, 710, 100);
        pregunta.setHorizontalAlignment(SwingConstants.CENTER);
        pregunta.setVerticalAlignment(SwingConstants.CENTER);
       
        r1.setText(p.preguntas.get(n).get(1));
        r2.setText(p.preguntas.get(n).get(2));
        r3.setText(p.preguntas.get(n).get(3));
        r4.setText(p.preguntas.get(n).get(4));
        r1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        r2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        r3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        r4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n_pregunta.setText("pregunta "+(n_p+1));
        nom_jugador.setText(jugador);
        tiempo_de_pregunta();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        r1 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        r3 = new javax.swing.JButton();
        r4 = new javax.swing.JButton();
        pregunta = new javax.swing.JLabel();
        n_pregunta = new javax.swing.JLabel();
        nom_jugador = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar();
        poder_1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 412));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 412));
        getContentPane().setLayout(null);

        r1.setText("jButton1");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(40, 170, 310, 100);

        r2.setText("jButton2");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(440, 170, 320, 100);

        r3.setText("jButton3");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        getContentPane().add(r3);
        r3.setBounds(40, 300, 310, 100);

        r4.setText("jButton4");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        getContentPane().add(r4);
        r4.setBounds(445, 300, 310, 100);

        pregunta.setText("toda la info de la pregunta");
        pregunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(pregunta);
        pregunta.setBounds(40, 20, 710, 100);
        getContentPane().add(n_pregunta);
        n_pregunta.setBounds(274, 30, 105, 27);
        getContentPane().add(nom_jugador);
        nom_jugador.setBounds(55, 84, 0, 0);

        progreso.setValue(100);
        getContentPane().add(progreso);
        progreso.setBounds(310, 120, 191, 42);

        poder_1.setText("50/50");
        poder_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poder_1ActionPerformed(evt);
            }
        });
        getContentPane().add(poder_1);
        poder_1.setBounds(360, 270, 72, 47);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab/pkg3/videojuego/imagenes/rere.png"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(800, 412));
        Fondo.setMinimumSize(new java.awt.Dimension(800, 412));
        Fondo.setPreferredSize(new java.awt.Dimension(800, 412));
        getContentPane().add(Fondo);
        Fondo.setBounds(-3, -4, 800, 412);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cambio_pregunta(){
        r4.setEnabled(true);
        r2.setEnabled(true);
        r1.setEnabled(true);
        r3.setEnabled(true);
        r1.setBackground(Color.WHITE);
        r2.setBackground(Color.WHITE);
        r3.setBackground(Color.WHITE);
        r4.setBackground(Color.WHITE);
        n = r.nextInt(p.preguntas.size());
        pregunta.setText("<html>"+p.preguntas.get(n).get(0)+"</br>");
        pregunta.setForeground(Color.WHITE);
        r1.setText(p.preguntas.get(n).get(1));
        r2.setText(p.preguntas.get(n).get(2));
        r3.setText(p.preguntas.get(n).get(3));
        r4.setText(p.preguntas.get(n).get(4));
        n_p++;
        n_pregunta.setText("pregunta "+(n_p+1));
        progreso.setValue(100);
        t.start();
    }
    
    private void tiempo_de_pregunta(){
        ac = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progreso.setValue(progreso.getValue()-1);
                if (progreso.getValue()==0) { 
                    t.stop();
                    pantalla_perder();
                }
            }
        };
        t = new Timer(100, ac);
        t.start();
        if (progreso.getValue() <= 0) {
            this.setVisible(false);
        }
    }

    private void pantalla_perder(){
        this.setVisible(false);
        game_over g = new game_over();
        g.setVisible(true);
        g.setBounds(0, 0, 500, 500);
        g.setLocationRelativeTo(null);
        g.setTitle("Pregunta 2");
        g.nom_jugador = jugador;
        g.puntos_valor = n_p;
        g.mostrar_info();

    }
    
    private void comprobar_pregunta(JButton boton){
        if (boton.getText().equals(p.preguntas.get(n).get(5))) {
            //aumentar puntos
            //boton.setBackground(Color.GREEN);
            t.stop();
            cambio_pregunta();
            if (n_p == 10) {
                pantalla_perder();
            }
        } else {
            //perder
            t.stop();
            pantalla_perder();
        }
    }

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        comprobar_pregunta(r1);
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        comprobar_pregunta(r2);
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        comprobar_pregunta(r3);
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        comprobar_pregunta(r4);
    }//GEN-LAST:event_r4ActionPerformed

    private void poder_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poder_1ActionPerformed
        poder_1.setBackground(Color.BLUE);
        poder_1.setEnabled(false);
        for(int i = 0; i < 5; i++){
            if (r1.getText().equals(p.preguntas.get(n).get(i))) {
                r1.setBackground(Color.GREEN);
                r1.setEnabled(false);
            } else if (r2.getText().equals(p.preguntas.get(n).get(i))) {
                r2.setBackground(Color.GREEN);
                r2.setEnabled(false);
            } else if (r3.getText().equals(p.preguntas.get(n).get(i))) {
                r3.setBackground(Color.GREEN);
                r3.setEnabled(false);
            } else if (r4.getText().equals(p.preguntas.get(n).get(i))) {
                r4.setBackground(Color.GREEN);
                r4.setEnabled(false);

            }
          
            //if (.getText() == p.preguntas.get(n).get(5)){

            }
        cambio_pregunta();
        }
//GEN-LAST:event_poder_1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel n_pregunta;
    private javax.swing.JLabel nom_jugador;
    private javax.swing.JButton poder_1;
    private javax.swing.JLabel pregunta;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JButton r1;
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton r4;
    // End of variables declaration//GEN-END:variables
}
