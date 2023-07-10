/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taiga;

/**
 *
 * @author mansy
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TabelListInfo extends JPanel {

    private static TabelListInfo newTabelListInfo() throws SQLException {
        return new TabelListInfo();
    }

    private Connection connection;
    private JTable table;
    private DefaultTableModel tableModel;

    public TabelListInfo() throws SQLException {
        connection = Koneksi.getConnection();

        initComponents();

        loadData();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Menambahkan label info "Pengeluaran"
        JLabel infoLabel = new JLabel("Pengeluaran");
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setBackground(Color.WHITE);
        infoLabel.setOpaque(true);
        add(infoLabel, BorderLayout.NORTH);

        // Membuat tabel untuk menampilkan pengeluaran terakhir
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nominal");
        tableModel.addColumn("Tanggal");
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void loadData() {

        try {
            // Mengambil total nominal dari tabel "total"
            int totalNominal = getTotalNominal();

            // Mengambil lima pengeluaran terakhir dari tabel "pengeluaran"
            List<Pengeluaran> pengeluaranList = getLatestPengeluaran(5);

            // Menampilkan total saldo dalam format rupiah
            JLabel totalLabel = new JLabel("Total Saldo: " + formatRupiah(totalNominal));
            add(totalLabel, BorderLayout.SOUTH);

            // Menampilkan pengeluaran terakhir dalam tabel
            for (Pengeluaran pengeluaran : pengeluaranList) {
                tableModel.addRow(new Object[]{formatRupiah(pengeluaran.getNominal()), pengeluaran.getTanggal()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengambil data dari database: " + e.getMessage());
        }
    }

    private int getTotalNominal() throws SQLException {
        int totalNominal = 0;
        String query = "SELECT SUM(nominal) AS total FROM total";
        try (PreparedStatement statement = connection.prepareStatement(query); ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                totalNominal = resultSet.getInt("total");
            }
        }
        return totalNominal;
    }

    private List<Pengeluaran> getLatestPengeluaran(int limit) throws SQLException {
        List<Pengeluaran> pengeluaranList = new ArrayList<>();
        String query = "SELECT nominal, tanggal FROM pengeluaran ORDER BY tanggal DESC LIMIT ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, limit);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int nominal = resultSet.getInt("nominal");
                    String tanggal = resultSet.getString("tanggal");
                    pengeluaranList.add(new Pengeluaran(nominal, tanggal));
                }
            }
        }
        return pengeluaranList;
    }

    private String formatRupiah(int nominal) {
        Locale locale = new Locale("id", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(nominal);
    }

    private static class Pengeluaran {

        private int nominal;
        private String tanggal;

        public Pengeluaran(int nominal, String tanggal) {
            this.nominal = nominal;
            this.tanggal = tanggal;
        }

        public int getNominal() {
            return nominal;
        }

        public String getTanggal() {
            return tanggal;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tabel dan List Info");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            TabelListInfo tabelListInfo = null;
            try {
                tabelListInfo = newTabelListInfo();
            } catch (SQLException ex) {
                Logger.getLogger(TabelListInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.add(tabelListInfo);
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
