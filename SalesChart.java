//three series chart depicting the top 3 items of each store
//so 3 series 3 JFreeChartGraphs
	import java.awt.*;
	import java.awt.Color;
	import java.awt.Font;
	import javax.swing.BorderFactory;
	import javax.swing.JFrame;
	import javax.swing.SwingUtilities;
	import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
	import org.jfree.chart.JFreeChart;
	import org.jfree.chart.block.BlockBorder;
	import org.jfree.chart.plot.PlotOrientation;
	import org.jfree.chart.plot.XYPlot;
	import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
	import org.jfree.chart.title.TextTitle;
	import org.jfree.data.xy.XYDataset;
	import org.jfree.data.xy.XYSeries;
	import org.jfree.data.xy.XYSeriesCollection;

public class SalesChart extends JFrame{
	


	

	    public SalesChart() {

	        initUI();
	    }

	    private void initUI() {

	        XYDataset dataset = createDataset();
	        JFreeChart chart = createChart(dataset);
	        ChartPanel chartPanel = new ChartPanel(chart);
	        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
	        chartPanel.setBackground(Color.white);
	        add(chartPanel);

	        pack();
	        setTitle("FastFood Statistics");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    private XYDataset createDataset() {

	        XYSeries series1 = new XYSeries("Best Food");
	        series1.add(18, 530);
	        series1.add(20, 580);
	        series1.add(25, 740);
	        series1.add(30, 901);
	        series1.add(40, 1300);
	        series1.add(50, 2219);
	        
	        XYSeries series2 = new XYSeries("2nd Best");
	        series2.add(18, 567);
	        series2.add(20, 612);
	        series2.add(25, 800);
	        series2.add(30, 980);
	        series2.add(40, 1210);
	        series2.add(50, 2350);
	        
	        XYSeries series3 = new XYSeries("3rd Best");
	        series3.add(5, 600);
	        series3.add(15, 1650);
	        series3.add(25, 760);
	        series3.add(30, 921);
	        series3.add(40, 1350);
	        series3.add(50, 2230);

	        XYSeriesCollection dataset = new XYSeriesCollection();
	        dataset.addSeries(series1);
	        dataset.addSeries(series2);
	        dataset.addSeries(series3);
	        
	        
  //  dataset.addValue( 20.00, "LowerBand" , "1-5-2018" );
	        return dataset;
	    }
	

	    private JFreeChart createChart(final XYDataset dataset) {

	        JFreeChart chart = ChartFactory.createXYLineChart(
	                "Best Food ", 
	                "Food", 
	                "Sales ($)", 
	                dataset, 
	                PlotOrientation.VERTICAL,true,true,false);
	        
	        ChartFrame frame1=new ChartFrame("XYLine Chart",chart);
	    	frame1.setVisible(true);
	    	frame1.setSize(300,300);

	        XYPlot plot = chart.getXYPlot();
	        
	        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
	        
	        renderer.setSeriesPaint(0, Color.RED);
	        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(1, Color.BLUE);
	        renderer.setSeriesStroke(1, new BasicStroke(2.0f));   
	        
	        renderer.setSeriesPaint(2, Color.GREEN);
	        renderer.setSeriesStroke(2, new BasicStroke(2.0f));        


	        plot.setRenderer(renderer);
	        plot.setBackgroundPaint(Color.white);

	        plot.setRangeGridlinesVisible(false);
	        plot.setDomainGridlinesVisible(false);

	        chart.getLegend().setFrame(BlockBorder.NONE);

	        chart.setTitle(new TextTitle("Best Food",
	                        new Font("Serif", Font.BOLD, 18)
	                )
	        );
			return chart;

	       
	    }
	
}
