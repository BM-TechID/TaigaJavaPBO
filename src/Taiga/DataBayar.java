/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Taiga;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author mansy
 */
public class DataBayar extends javax.swing.JFrame {

    /**
     * Creates new form DashboardMain
     */
    public DataBayar() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDataBayar = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnDataWarga = new javax.swing.JButton();
        btnPengeluaran = new javax.swing.JButton();
        btnPengaturan = new javax.swing.JButton();
        btnPemasukan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TAI");
        jPanel1.add(jLabel4);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("GA");
        jPanel1.add(jLabel3);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Tagihan dan Iuran Warga");
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnDataBayar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDataBayar.setText("Data Bayar");
        btnDataBayar.setMaximumSize(new java.awt.Dimension(90, 35));
        btnDataBayar.setMinimumSize(new java.awt.Dimension(90, 30));
        btnDataBayar.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDataBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBayarActionPerformed(evt);
            }
        });

        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setMaximumSize(new java.awt.Dimension(90, 35));
        btnDashboard.setMinimumSize(new java.awt.Dimension(90, 30));
        btnDashboard.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnDataWarga.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDataWarga.setText("Data Warga");
        btnDataWarga.setMaximumSize(new java.awt.Dimension(90, 35));
        btnDataWarga.setMinimumSize(new java.awt.Dimension(90, 30));
        btnDataWarga.setPreferredSize(new java.awt.Dimension(90, 30));
        btnDataWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataWargaActionPerformed(evt);
            }
        });

        btnPengeluaran.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPengeluaran.setText("Pengeluaran");
        btnPengeluaran.setMaximumSize(new java.awt.Dimension(90, 35));
        btnPengeluaran.setMinimumSize(new java.awt.Dimension(90, 30));
        btnPengeluaran.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengeluaranActionPerformed(evt);
            }
        });

        btnPengaturan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPengaturan.setText("Pengaturan");
        btnPengaturan.setMaximumSize(new java.awt.Dimension(90, 35));
        btnPengaturan.setMinimumSize(new java.awt.Dimension(90, 30));
        btnPengaturan.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengaturanActionPerformed(evt);
            }
        });

        btnPemasukan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPemasukan.setText("Pemasukan");
        btnPemasukan.setMaximumSize(new java.awt.Dimension(90, 35));
        btnPemasukan.setMinimumSize(new java.awt.Dimension(90, 30));
        btnPemasukan.setPreferredSize(new java.awt.Dimension(90, 30));
        btnPemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemasukanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPengaturan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataWarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPengeluaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataWarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnPemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(btnPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 670));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 760, 620));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(275, 275, 275))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBayarActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        DataBayar databayar = new DataBayar();
        databayar.setVisible(true);
    }//GEN-LAST:event_btnDataBayarActionPerformed

    private void btnPengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengaturanActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        Pengaturan pengaturan = new Pengaturan();
        pengaturan.setVisible(true);
    }//GEN-LAST:event_btnPengaturanActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:DataWarga dataWarga = new DataWarga();
        this.dispose(); // Menutup frame saat ini
        DataBayar dashboardmain = new DataBayar();
        dashboardmain.setVisible(true);
        

            
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDataWargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataWargaActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        DataWarga datawarga = new DataWarga();
        datawarga.setVisible(true);
    }//GEN-LAST:event_btnDataWargaActionPerformed

    private void btnPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengeluaranActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        Pengeluaran pengeluaran = new Pengeluaran();
        pengeluaran.setVisible(true);
    }//GEN-LAST:event_btnPengeluaranActionPerformed

    private void btnPemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemasukanActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup frame saat ini
        Pemasukan pemasukan = new Pemasukan();
        pemasukan.setVisible(true);
    }//GEN-LAST:event_btnPemasukanActionPerformed

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
            java.util.logging.Logger.getLogger(DataBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDataBayar;
    private javax.swing.JButton btnDataWarga;
    private javax.swing.JButton btnPemasukan;
    private javax.swing.JButton btnPengaturan;
    private javax.swing.JButton btnPengeluaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
