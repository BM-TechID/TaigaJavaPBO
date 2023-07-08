/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Taiga;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author mansy
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
         // Mengatur ukuran default untuk tablet
        int tabletWidth = 800;
        int tabletHeight = 600;

        // Menambah faktor skala
        double scale = 1.2; // Faktor skala 1.2 akan membesarkan ukuran frame sebesar 20%
        int scaledWidth = (int) (tabletWidth * scale);
        int scaledHeight = (int) (tabletHeight * scale);

        Dimension scaledSize = new Dimension(scaledWidth, scaledHeight);
        setPreferredSize(scaledSize);

        // Mengatur warna latar belakang menjadi putih
        getContentPane().setBackground(Color.WHITE);

        pack(); // Atur ukuran frame secara otomatis
        setVisible(true);

        // Mengatur posisi frame di tengah layar
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 189, 48));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Background.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1030, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        // TODO add your handling code here:
        try {
             Thread.sleep(1000); // Menunda eksekusi selama 3 detik (3000 milidetik)
            this.dispose(); // Menutup frame saat ini

            signinAdmin signinAdmin = new signinAdmin();
            signinAdmin.setVisible(true);
            signinAdmin.revalidate(); // Memperbarui tampilan frame
            signinAdmin.repaint();
           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            
    }//GEN-LAST:event_jLabel1MouseMoved

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
