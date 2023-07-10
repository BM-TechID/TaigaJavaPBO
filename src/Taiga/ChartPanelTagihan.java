package Taiga;

import static Taiga.Koneksi.getConnection;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ChartPanelTagihan extends JPanel {

    public ChartPanelTagihan() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Panggil metode createBarChart untuk membuat chart dan menambahkannya ke panel
        createBarChart();
    }

    private void createBarChart() {
        // Membuat dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            Connection conn = getConnection(); // Koneksi ke database
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT bulan, nominal FROM tagihan");

            while (rs.next()) {
                String bulan = rs.getString("bulan");
                int nominal = rs.getInt("nominal");
                dataset.addValue(nominal, "Amount", bulan);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengambil data dari database: " + e.getMessage());
            return;
        }

        // Membuat chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Tagihan", // Judul chart
                "Month", // Label sumbu x
                "Amount", // Label sumbu y
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Orientasi chart (VERTICAL atau HORIZONTAL)
                false, // Tampilkan legenda
                true, // Tampilkan tooltip
                false // Tampilkan URL
        );

        // Mengubah warna plot background menjadi putih
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);

        // Membuat panel chart
        ChartPanel chartPanel = new ChartPanel(chart);

        // Menambahkan chartPanel ke dalam panel
        add(chartPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tagihan");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Membuat objek ChartPanelTagihan dan menambahkannya ke frame
            ChartPanelTagihan panel = new ChartPanelTagihan();
            frame.add(panel);

            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
