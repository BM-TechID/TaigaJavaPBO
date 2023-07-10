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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PieChartPanel extends JPanel {

    private Connection connection;
    private DefaultPieDataset dataset;

    public PieChartPanel() throws SQLException {
        connection = Koneksi.getConnection();
        dataset = new DefaultPieDataset();
        createPieChart();
    }

    private void createPieChart() {
        try {
            String query = "SELECT untuk, COUNT(*) AS jumlah FROM tagihan GROUP BY untuk";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String untuk = resultSet.getString("untuk");
                int jumlah = resultSet.getInt("jumlah");
                dataset.setValue(untuk, jumlah);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            Logger.getLogger(PieChartPanel.class.getName()).log(Level.SEVERE, null, e);
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Data Dominan Warga", dataset, true, true, false);
        pieChart.getPlot().setBackgroundPaint(Color.WHITE);
        ChartPanel chartPanel = new ChartPanel(pieChart);

        setLayout(new BorderLayout());
        add(chartPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                JFrame frame = new JFrame("Pie Chart");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                PieChartPanel pieChartPanel = new PieChartPanel();
                frame.add(pieChartPanel);
                frame.pack();
                frame.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(PieChartPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
