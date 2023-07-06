/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Taiga;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mansy
 */
public class DataWarga extends javax.swing.JFrame {

    /**
     * Creates new form DashboardMain
     */
    public DataWarga() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtJalan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtIdWarga = new javax.swing.JTextField();
        TxtNama = new javax.swing.JTextField();
        TxtNoRumah = new javax.swing.JTextField();
        TxtRT = new javax.swing.JTextField();
        TxtCari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BtnCari = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        TxtNoHP = new javax.swing.JTextField();
        BtnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
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
        btnPemasukan.setText("Tagihan");
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
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Id Warga");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        jLabel6.setText("Nama");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));
        jPanel3.add(TxtJalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 230, -1));

        jLabel9.setText("Jalan");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        TxtIdWarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtIdWargaMouseClicked(evt);
            }
        });
        jPanel3.add(TxtIdWarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 230, -1));
        jPanel3.add(TxtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 230, -1));
        jPanel3.add(TxtNoRumah, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 230, -1));
        jPanel3.add(TxtRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 230, -1));

        TxtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCariActionPerformed(evt);
            }
        });
        jPanel3.add(TxtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 370, -1));

        jLabel10.setText("No HP");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 30));

        jLabel7.setText("RT");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 30));

        jLabel8.setText("No Rumah");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 31, -1, 30));

        BtnCari.setText("Cari");
        BtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariActionPerformed(evt);
            }
        });
        jPanel3.add(BtnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });
        jPanel3.add(BtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        TxtNoHP.setText("62");
        TxtNoHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNoHPActionPerformed(evt);
            }
        });
        jPanel3.add(TxtNoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 230, -1));

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(BtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Warga", "Nama", "Jalan", "No Rumah", "RT", "No HP"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 710, 350));

        jFormattedTextField1.setText("jFormattedTextField1");
        jPanel3.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 760, 620));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("DATA WARGA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel2)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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
        DashboardMain dashboardmain = new DashboardMain();
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
        Tagihan pemasukan = new Tagihan();
        pemasukan.setVisible(true);
    }//GEN-LAST:event_btnPemasukanActionPerformed

    private void TxtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCariActionPerformed

    private void TxtNoHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNoHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNoHPActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        TxtNama.setText("");
        TxtJalan.setText("");
        TxtNoRumah.setText("");
        TxtRT.setText("");
        TxtNoHP.setText("");
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        refreshTableData(); // Update pada tabel data
        String idWarga = TxtIdWarga.getText();
        String nama = TxtNama.getText();
        String jalan = TxtJalan.getText();
        String noRumah = TxtNoRumah.getText();
        String rt = TxtRT.getText();
        String noHP = TxtNoHP.getText();

        try {
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();

            String sql = String.format("INSERT INTO data_warga (id_warga, nama, jalan, no_rumah, rt, no_hp) VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                    idWarga, nama, jalan, noRumah, rt, noHP);

            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            refreshTableData(); // Update pada tabel data

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data!");
        }
        
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void TxtIdWargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtIdWargaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
        isiIdWargaOtomatis();
    }
    }//GEN-LAST:event_TxtIdWargaMouseClicked

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        String idWarga = TxtIdWarga.getText();
        String nama = TxtNama.getText();
        String jalan = TxtJalan.getText();
        String noRumah = TxtNoRumah.getText();
        String rt = TxtRT.getText();
        String noHP = TxtNoHP.getText();

        try {
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            String query = "UPDATE data_warga SET nama = '" + nama + "', jalan = '" + jalan + "', no_rumah = '" + noRumah + "', rt = '" + rt + "', no_hp = '" + noHP + "' WHERE id_warga = " + idWarga;
            stmt.executeUpdate(query);
            stmt.close();
            conn.close();
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memperbarui data");
        }

        refreshTableData(); // Memperbarui tampilan tabel setelah update
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        // Mendapatkan indeks baris yang dipilih dari tabel
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow >= 0) {
            // Mendapatkan nilai ID warga dari kolom pertama (indeks 0) pada baris yang dipilih
            String idWargaStr = jTable1.getValueAt(selectedRow, 0).toString();
            int idWarga = Integer.parseInt(idWargaStr);


            try {
                // Membuat koneksi ke database
                Connection conn = Koneksi.getConnection();

                // Membuat objek PreparedStatement untuk menjalankan perintah SQL DELETE
                PreparedStatement stmt = conn.prepareStatement("DELETE FROM data_warga WHERE id_warga = ?");

                // Mengatur parameter ID warga pada pernyataan SQL DELETE
                stmt.setInt(1, idWarga);

                // Menjalankan perintah SQL DELETE
                int affectedRows = stmt.executeUpdate();

                if (affectedRows > 0) {
                    // Jika penghapusan berhasil, tampilkan pesan sukses dan perbarui tampilan tabel
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    refreshTableData();
                } else {
                    // Jika tidak ada baris yang terpengaruh, tampilkan pesan error
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data");
                }

                // Menutup statement dan koneksi
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                // Menangani exception jika terjadi kesalahan saat menghapus data
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data");
            }
        } else {
            // Jika tidak ada baris yang dipilih, tampilkan pesan peringatan
            JOptionPane.showMessageDialog(null, "Silakan pilih baris yang ingin dihapus");
        }
        
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariActionPerformed
        // TODO add your handling code here:
          String kataKunci = TxtCari.getText(); // Mengambil kata kunci pencarian dari TxtCari

        // Panggil metode untuk melakukan pencarian berdasarkan kata kunci
        cariDataWarga(kataKunci);
    }

    private void cariDataWarga(String kataKunci) {
        // Lakukan operasi pencarian data warga berdasarkan kata kunci
        // Misalnya, gunakan query SQL untuk melakukan pencarian di database
        String query = "SELECT * FROM data_warga WHERE nama LIKE '%" + kataKunci + "%'";

        try {
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                // Jika hasil pencarian ditemukan, ambil data dari setiap kolom
                int idWarga = rs.getInt("id_warga");
                String nama = rs.getString("nama");
                String jalan = rs.getString("jalan");
                String noRumah = rs.getString("no_rumah");
                String rt = rs.getString("rt");
                String noHP = rs.getString("no_hp");

                // Tampilkan hasil pencarian di komponen teks
                TxtIdWarga.setText(String.valueOf(idWarga));
                TxtNama.setText(nama);
                TxtJalan.setText(jalan);
                TxtNoRumah.setText(noRumah);
                TxtRT.setText(rt);
                TxtNoHP.setText(noHP);
                
                 JOptionPane.showMessageDialog(this, "Data ditemukan");
            } else {
                // Jika tidak ada hasil pencarian, kosongkan komponen teks
                TxtIdWarga.setText("");
                TxtNama.setText("");
                TxtJalan.setText("");
                TxtNoRumah.setText("");
                TxtRT.setText("");
                TxtNoHP.setText("");
                
                 JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            // Tangani exception SQL
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnCariActionPerformed

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
            java.util.logging.Logger.getLogger(DataWarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataWarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataWarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataWarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataWarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCari;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JTextField TxtIdWarga;
    private javax.swing.JTextField TxtJalan;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtNoHP;
    private javax.swing.JTextField TxtNoRumah;
    private javax.swing.JTextField TxtRT;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDataBayar;
    private javax.swing.JButton btnDataWarga;
    private javax.swing.JButton btnPemasukan;
    private javax.swing.JButton btnPengaturan;
    private javax.swing.JButton btnPengeluaran;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   private void isiIdWargaOtomatis() {
    try {
        Connection conn = Koneksi.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT MAX(id_warga) AS lastId FROM data_warga");

        if (rs.next()) {
            int lastId = rs.getInt("lastId");
            int newId = lastId + 1;
            TxtIdWarga.setText(Integer.toString(newId));
        } else {
            TxtIdWarga.setText("1");
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
   private void refreshTableData() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Menghapus semua baris yang ada pada model tabel

    try {
        Connection conn = Koneksi.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM data_warga");
        
         jTable1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int selectedRow = jTable1.getSelectedRow();
            selectedIdWarga = jTable1.getValueAt(selectedRow, 0).toString(); // Mengambil ID warga dari kolom pertama (indeks 0)
            fillFormWithData(selectedIdWarga); // Mengisi formulir dengan data yang dipilih
        }
    });

        while (rs.next()) {
            String idWarga = rs.getString("id_warga");
            String nama = rs.getString("nama");
            String jalan = rs.getString("jalan");
            String noRumah = rs.getString("no_rumah");
            String rt = rs.getString("rt");
            String noHP = rs.getString("no_hp");

            Object[] row = {idWarga, nama, jalan, noRumah, rt, noHP};
            model.addRow(row);
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

   private String selectedIdWarga; // Variabel untuk menyimpan ID warga yang dipilih

private void fillFormWithData(String idWarga) {
    try {
        Connection conn = Koneksi.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM data_warga WHERE id_warga = " + idWarga);

        if (rs.next()) {
            String nama = rs.getString("nama");
            String jalan = rs.getString("jalan");
            String noRumah = rs.getString("no_rumah");
            String rt = rs.getString("rt");
            String noHP = rs.getString("no_hp");

            TxtIdWarga.setText(idWarga);
            TxtNama.setText(nama);
            TxtJalan.setText(jalan);
            TxtNoRumah.setText(noRumah);
            TxtRT.setText(rt);
            TxtNoHP.setText(noHP);
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    private void resetForm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class idWargaTextField {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public idWargaTextField() {
        }
    }
}
