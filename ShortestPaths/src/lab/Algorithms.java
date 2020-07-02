package lab;

/**
 * Aufgabe H1
 * 
 * Abgabe von: <name>, <name> und <name>
 */

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.PriorityQueue;

import frame.Graph;
import frame.SSSPNode;


public class Algorithms
{
	
	/**
	 * 
	 * @param graph input graph
	 * @param edgeRatio specifying until what ratio of actualEdge#/possibleEdge# the Johnsons is to run, otherwise FloydWarshall will be run
	 * @return a hashmap with the nodeId´s as entries for "their" SSSPNodes
	 */
	public static Hashtable<Integer, Hashtable<Integer,SSSPNode>> HybridSSSP(Graph graph, double edgeRatio){
		// TODO
		throw new RuntimeException("Not implemented yet!");
	}
	
	
	
	/**
	 * 
	 * @param graph on which to run the algorithm
	 * @return a hashmap with the nodeId´s as entries for "their" SSSPNodes; null if negative cycle exists
	 */
	public static Hashtable<Integer, Hashtable<Integer,SSSPNode>> Johnson(Graph graph) {
		// TODO
		throw new RuntimeException("Not implemented yet!");
	}
	
	/**
	 * 
	 * @param graph the input graph
	 * @param source a valid Node ID of the graph
	 * @return for each node in the graph an entry in the hashmap which leads to a datatype storing the results
	 *    	   of the algorithm	(as on the slides); returns null if negative cycle exists
	 */
	public static Hashtable<Integer, SSSPNode> BellmanFord(Graph graph, int source) {
		// TODO
		throw new RuntimeException("Not implemented yet!");
	}
	
	/**
	 * 
	 * @param graph the input graph
	 * @param source a valid Node ID of the graph
	 * @return for each node in the graph an entry in the hashmap which leads to a datatype storing the results
	 * 		   of the algorithm (as on the slides)
	 */
	public static Hashtable<Integer, SSSPNode> Dijkstra(Graph graph, int source) {
		// TODO
		throw new RuntimeException("Not implemented yet!");
	}
	
	/**
	 * 
	 * @param graph input graph
	 * @return a hashmap with the nodeId´s as entries for "their" SSSPNodes; null if negative cycle exists
	 */
	public static Hashtable<Integer, Hashtable<Integer, SSSPNode>> FloydWarshall(Graph graph){
		// TODO
		throw new RuntimeException("Not implemented yet!");
	}
	
	
}
