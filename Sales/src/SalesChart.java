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
	    	//Each dataset is for a differnt menu item and what its categorized in the data file.

	        XYSeries series1 = new XYSeries("A1");
	        series1.add(1, 530);
	        series1.add(1, 0);
	        
	        XYSeries series2 = new XYSeries("A2");
	        series2.add(2, 567);
	        series2.add(2, 0);
	        
	        XYSeries series3 = new XYSeries("A3");
	        series3.add(3, 600);
	        series3.add(3, 0);
	        
	        XYSeries series4 = new XYSeries("A4");
	        series4.add(4, 530);
	        series4.add(4, 0);
	        
	        XYSeries series5 = new XYSeries("A5");
	        series5.add(5, 567);
	        series5.add(5, 0);
	        
	        XYSeries series6 = new XYSeries("A6");
	        series6.add(6, 600);
	        series6.add(6, 0);
	        
	        XYSeries series7 = new XYSeries("A7");
	        series7.add(7, 530);
	        series7.add(7, 0);
	        
	        XYSeries series8 = new XYSeries("A8");
	        series8.add(8, 567);
	        series8.add(8, 0);
	        
	        XYSeries series9 = new XYSeries("A9");
	        series9.add(9, 600);
	        series9.add(9, 0);

	        XYSeriesCollection dataset = new XYSeriesCollection();
	        dataset.addSeries(series1);
	        dataset.addSeries(series2);
	        dataset.addSeries(series3);
	        dataset.addSeries(series4);
	        dataset.addSeries(series5);
	        dataset.addSeries(series6);
	        dataset.addSeries(series7);
	        dataset.addSeries(series8);
	        dataset.addSeries(series9);
	        
	        
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
	        
	        renderer.setSeriesPaint(3, Color.BLACK);
	        renderer.setSeriesStroke(3, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(4, Color.YELLOW);
	        renderer.setSeriesStroke(4, new BasicStroke(2.0f));   
	        
	        renderer.setSeriesPaint(5, Color.ORANGE);
	        renderer.setSeriesStroke(5, new BasicStroke(2.0f)); 
	        
	        renderer.setSeriesPaint(6, Color.PINK);
	        renderer.setSeriesStroke(6, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(7, Color.RED);
	        renderer.setSeriesStroke(7, new BasicStroke(2.0f));   
	        
	        renderer.setSeriesPaint(8, Color.BLUE);
	        renderer.setSeriesStroke(8, new BasicStroke(2.0f)); 


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