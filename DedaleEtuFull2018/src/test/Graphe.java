package test;

import java.util.List;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.GraphDelegator;
import org.jgrapht.graph.SimpleDirectedGraph;

import env.Couple;





public class Graphe extends GraphDelegator<String, Couple<String,String>>{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2955526421600589765L;
//	private List<String> nodes;
//	private HashMap<String,HashSet<String>> edges;
	private DijkstraShortestPath<String,Couple<String,String>> shortestPath;
	
	

	public Graphe() {
		super(new SimpleDirectedGraph(String.class));
//		nodes = new ArrayList<String>();
//		edges = new HashMap<String,HashSet<String>>();
	}

	
//	
//	public boolean isAdjacent(String n1,String n2){
//		return edges.get(n1).contains(n2);
//	}
	
//	public HashSet<String> getAdjacent(String n){
//		return edges.get(n);
//	}
//	
//	public void addNode(String n){
//		nodes.add(n);
//	}
	
//	public void addEdge(String n1,String n2){
//		HashSet<String> adj = edges.get(n1);
//		adj.add(n2);
//		edges.put(n1,adj);
//	}
//	
//	public void addEdges(String n,HashSet<String> m){
//		HashSet<String> adj = edges.get(n);
//		adj.addAll(m);
//		edges.put(n,m);
//	}
	
//	public boolean existNode(String n){
//		 return nodes.contains(n);
//	}
	
	
	
	// A utility function to find the vertex with minimum distance value, from
	// the set of vertices not yet included in shortest path tree
//	public String minDistance(HashMap<String,Integer> dist, HashMap<String,Boolean> sptSet,String src){
//	   // Initialize min value
//	   int min = nodes.size();
//	   String min_index=src;
//	  
//	   for (String v:nodes){
//	     if (!sptSet.get(v) && dist.get(v) <= min)
//	        min = dist.get(v);
//	     	min_index = v;
//	   }
//	   return min_index;
//	}
	  
	
	public List<String> shortestPath(String src, String dest){
		shortestPath = new DijkstraShortestPath<String, Couple<String,String>>(this);
		return shortestPath.getPath(src,dest).getVertexList();
	}
	
//	public List<String> dijkstra(String src,String dest){
//		HashMap<String,Integer> dist = new HashMap<String,Integer>();     // The output array.  dist[i] will hold the shortest
//		                      // distance from src to i
//		  
//		HashMap<String,Boolean>sptSet = new HashMap<String,Boolean>(); // sptSet[i] will true if vertex i is included in shortest
//		                     // path tree or shortest distance from src to i is finalized
//		List<String> chemin = new ArrayList<String>();  
//		// Initialize all distances as INFINITE and stpSet[] as false
//		for(String i: nodes){
//		     dist.put(i, nodes.size());
//		     sptSet.put(i,false);
//		 }
//		  
//		 // Distance of source vertex from itself is always 0
//		dist.replace(src, 0);
//		String u = src;
//		// Find shortest path for all vertices
//		for(int i = 0; i < nodes.size(); i++){		       // Pick the minimum distance vertex from the set of vertices not
//		       // yet processed. u is always equal to src in first iteration.
//		       u = minDistance(dist, sptSet,u);
//		  
//		       // Mark the picked vertex as processed
//		       sptSet.replace(u,true);
//		  
//		       // Update dist value of the adjacent vertices of the picked vertex.
//		       for (String v : nodes){
//		  
//		         // Update dist[v] only if is not in sptSet, there is an edge from 
//		         // u to v, and total weight of path from src to  v through u is 
//		         // smaller than current value of dist[v]
//		         if (!sptSet.get(u) && isAdjacent(u,v) && dist.get(u) != nodes.size() 
//		                                       && dist.get(u)+ 1 < dist.get(v))
//		            dist.replace(v,dist.get(u) + 1);
//		     }
//		}
//	}


}


