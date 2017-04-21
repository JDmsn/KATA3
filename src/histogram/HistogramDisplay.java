package histogram;

import java.awt.Dimension;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;

public class HistogramDisplay extends ApplicationFrame {
  private final Histogram<String> hm;

    public HistogramDisplay(Histogram<String> hm) {
        super("Histogram");
        this.hm = hm;
        setContentPane(createPanel());
        pack();
    }

    private ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(600, 400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dt) {
        JFreeChart jFreeChart = ChartFactory.createBarChart(
                null, "Dominios", "Número de emails", dt,
                PlotOrientation.VERTICAL, true, true, false);
        return jFreeChart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dt = new DefaultCategoryDataset();
        for (String key : hm.keySet()) {
            System.out.println(hm.getValueOf(key));
            dt.addValue(histogram.getValueOf(key), "", key);
        }
        return dataset;
    }

    public void execute() {
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
