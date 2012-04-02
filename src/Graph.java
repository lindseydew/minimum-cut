import src.Edge;

import java.util.LinkedList;
import java.util.Random;

public class Graph {
    
    private int V;
    private int countE;
    private LinkedList<Integer>[] adj;


        /**
         * Create an empty graph with V vertices.
         */
        public Graph(int V) {
            if (V < 0) throw new RuntimeException("Number of vertices must be nonnegative");
            this.V = V;
            this.countE = 0;
            adj = (LinkedList<Integer>[]) new LinkedList[V];
            for (int v = 0; v < V; v++) {
                adj[v] = new LinkedList<Integer>();
            }
        }

        /**
         * Create a random graph with V vertices and countE edges.
         * Expected running time is proportional to V + countE.
         */
        public Graph(int V, int E) {
            this(V);
            if (E < 0) throw new RuntimeException("Number of edges must be nonnegative");
//            for (int i = 0; i < countE; i++) {
//                int v = (int) (Math.random() * V);
//                int w = (int) (Math.random() * V);
//                addEdge(v, w);
//            }
            addEdge(new Edge(0, 1));
            addEdge(new Edge(0, 2));
            addEdge(new Edge(1, 2));
            addEdge(new Edge(1, 3));
            addEdge(new Edge(2, 3));
        }
//
//        /**
//         * Create a digraph from input stream.
//
//        public Graph(In in) {
//            this(in.readInt());
//            int countE = in.readInt();
//            for (int i = 0; i < countE; i++) {
//                int v = in.readInt();
//                int w = in.readInt();
//                addEdge(v, w);
//            }
//        }
////
//        /**
//         * Copy constructor.
//         */
//        public Graph(Graph G) {
//            this(G.V());
//            this.countE = G.countE();
//            for (int v = 0; v < G.V(); v++) {
//                // reverse so that adjacency list is in same order as original
//                Stack<Integer> reverse = new Stack<Integer>();
//                for (int w : G.adj[v]) {
//                    reverse.push(w);
//                }
//                for (int w : reverse) {
//                    adj[v].add(w);
//                }
//            }
//        }

        /**
         * Return the number of vertices in the graph.
         */
        public int getV() { return V; }

        /**
         * Return the number of edges in the graph.
         */
        public int getCountE() { return countE; }

        public LinkedList<Integer>[] getAdj() { return adj;}


        /**
         * Add the edge v-w to graph.
         */
        public void addEdge(Edge edge) {
            countE++;
            int u = edge.getU();
            int v = edge.getV();
            adj[u].add(v);
            adj[v].add(u);
        }


       

      
//
        /**
         * Return the list of neighbors of vertex v as in Iterable.
         */
        public Iterable<Integer> adj(int v) {
            return adj[v];
        }


        /**
         * Return a string representation of the graph.
         */
        public String toString() {
            StringBuilder s = new StringBuilder();
            String NEWLINE = System.getProperty("line.separator");
            s.append(V + " vertices, " + countE + " edges " + NEWLINE);
            for (int v = 0; v < V; v++) {
                s.append(v + ": ");
                for (int w : adj[v]) {
                    s.append(w + " ");

                }
                s.append(NEWLINE);
            }
            return s.toString();
        }

    
        public String toEdgeListString() {
            StringBuilder s = new StringBuilder();
            String NEWLINE = System.getProperty("line.separator");
            s.append(V + " vertices, " + countE + " edges" + NEWLINE);
            s.append("[ ");
                    for(int v = 0; v < V; v++) {
                            for (int w : adj[v]) {
                                if(v > w) {
                                    s.append("");
                                }
                                else {
                                    s.append("{");
                                    s.append(v + ", ");
                                    s.append(w);
                                    s.append("} ");
                                }
                            }
                    }
            s.append("]");
            return s.toString();
        }

        public String toAdjacencyListString() {
            StringBuilder s = new StringBuilder();
            String NEWLINE = System.getProperty("line.separator");
            s.append(V + " vertices, " + countE + " edges" + NEWLINE);
            s.append("{ ");
                for(int v = 0; v < V; v++) {
                    s.append("[ ");
                    for (int w : adj[v]) {
                        s.append(w + " ");
                        
                    }
                    s.append("]");
                }
            s.append(" }");
            return s.toString();
        }






        public void mergeEdge(int edge) {
            countE--;
            V--;



        }

//        public void removeSelfLoops() {
//            for(int v = 0; v < V; v++) {
//
//            }
//        }





//        while(graph.getV() > 2) {
//    edge = chooseEdge(graph)   done
//    graph = merge(edge)
//    graph = removeSelfLoops(graph)
//    return graph
//    }
    
//        public void contract(Graph graph) {
//            while(graph.getV() > 2) {
//                int edge = graph.chooseEdgeAtRandom();
//
//
//
//            }
//
//
//
//        }

}



