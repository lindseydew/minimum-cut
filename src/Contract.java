import src.Edge;

import java.util.LinkedList;
import java.util.Random;

public class Contract {
	
	Graph graph = new Graph(4, 5);
    
	public void contract() {
    while(graph.getV() > 2) {
    	Edge edge = chooseEdgeAtRandom(graph);
    //graph = merge(edge)
    //graph = removeSelfLoops(graph)
    //return graph
    //}

    //












    }
	}






    public Graph merge(Edge edge, Graph graph) {
        int u = edge.getU();
        int v = edge.getV();
        int nVertices = graph.getV();
        LinkedList<Integer>[] adj = graph.getAdj();
//        LinkedList<Integer> touchingVertices = adj[u];

       
//        Graph mergedGraph = new Graph(nVertices-1);
//            int newVertex = 0;
//            for(int vertex1 = 0; vertex1 < graph.getV(); vertex1++) {
//                if(vertex1 != u) {
//                    for(int vertex2 : adj[vertex1]) {
//                            if(vertex2 != u) {
//                                if(vertex1 > vertex2){
//                                    mergedGraph.addEdge(new Edge(newVertex, vertex2));
//                                    newVertex++;
//                            }
//                        }
//                    }
//                }
//            }
//         return mergedGraph;
        
        
        Graph mergedGraph = new Graph(nVertices-1);


    }

    public Edge chooseEdgeAtRandom(Graph graph) {
        Random generator = new Random();
        int v = graph.getV();
        int vertex1 = generator.nextInt(v);
        LinkedList<Integer>[] adj = graph.getAdj();
        int length = adj[vertex1].size();
        int indw = generator.nextInt(length);
        int vertex2 = adj[vertex1].get(indw);
        System.out.println("v " + v);
        Edge edge = new Edge(vertex1, vertex2);
        return edge;

    }


	
}