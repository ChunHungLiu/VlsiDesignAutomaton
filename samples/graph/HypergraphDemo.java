package samples.graph;

import java.util.Arrays;
import java.awt.Dimension;
import javax.swing.JFrame;

import edu.uci.ics.jung.algorithms.layout.*;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.visualization.*;
import edu.uci.ics.jung.visualization.renderers.*;

/**
 * This is a demo application that shows how a sample hypergraph can be visualized in 
 * a JFrame.
 *  
 * @author Andrea Francke, Olivier Clerc
 */
public class HypergraphDemo {
	public static void main(String[] args) {		
		// construct new hypergraph
		Hypergraph<Integer, Character> hg = new SetHypergraph<Integer, Character>();
		
		// add hypervertices
		hg.addVertex(1);
		hg.addVertex(2);
		hg.addVertex(3);
		hg.addVertex(4);
		hg.addVertex(5);
		hg.addVertex(6);
		hg.addVertex(7);
		
		// add hyperedges
		hg.addEdge('a', Arrays.asList(6));				
		hg.addEdge('b', Arrays.asList(1, 5));
		hg.addEdge('c', Arrays.asList(2, 3, 4));
		hg.addEdge('d', Arrays.asList(1, 2, 3));		
		hg.addEdge('e', Arrays.asList(4, 3));	
		hg.addEdge('f', Arrays.asList(1, 2));			
		hg.addEdge('g', Arrays.asList(7, 6));
		hg.addEdge('h', Arrays.asList(2, 4));
		hg.addEdge('i', Arrays.asList(1, 2, 3, 4, 5));		

		// create hypergraph layout
		HypergraphLayout<Integer, Character> l = new HypergraphLayout<Integer, Character>(hg, FRLayout.class);		
		
		// create visualization viewer
		VisualizationViewer<Integer, Character> v = new VisualizationViewer<Integer, Character>(l, new Dimension(300, 300));
		
		// replace standard renderer with hypergraph renderer
		v.setRenderer(new BasicHypergraphRenderer<Integer, Character>());
		
		// create JFrame and add visualization viewer to content pane
		JFrame frame = new JFrame("JUNG Demo");
		frame.setSize(new Dimension(600, 600));
		frame.getContentPane().add(v);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);	
	}
}