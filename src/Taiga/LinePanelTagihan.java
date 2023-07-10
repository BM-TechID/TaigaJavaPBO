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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class LinePanelTagihan {

    private JPanel panelLineChart;
    private Connection connection;

    public LinePanelTagihan() throws SQLException {
        // Initialize the database connection
        connection = Koneksi.getConnection();

        // Initialize the panel for the line chart
        panelLineChart = new JPanel();
        panelLineChart.setLayout(new BorderLayout());
    }

    public void showLineChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            // Fetch data from the database
            String query = "SELECT tanggal, nominal FROM total_uang";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Iterate over the result set and add data to the dataset
            while (resultSet.next()) {
                String tanggal = resultSet.getString("tanggal");
                double nominal = resultSet.getDouble("nominal");
                dataset.setValue(nominal, "Jumlah", tanggal);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create chart
        JFreeChart linechart = ChartFactory.createLineChart(
                "Kontribusi", "Bulan", "Jumlah", dataset,
                PlotOrientation.VERTICAL, false, true, false
        );

        // Customize the chart
        CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
        lineCategoryPlot.setBackgroundPaint(Color.white);

        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204, 0, 51);
        lineRenderer.setSeriesPaint(0, lineChartColor);

        // Create ChartPanel to display the chart
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.revalidate();
        panelLineChart.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                LinePanelTagihan linePanelTagihan = new LinePanelTagihan();
                linePanelTagihan.showLineChart();

                JFrame frame = new JFrame("Line Chart");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(linePanelTagihan.panelLineChart);
                frame.pack();
                frame.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(LinePanelTagihan.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    JPanel getPanelLineChart() {
        return panelLineChart;
    }

}
