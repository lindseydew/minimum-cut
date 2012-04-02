import src.Edge;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: lindseydew
 * Date: 31/03/2012
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
public class MinimumCut {
    
    public static void main (String[] args) {
        

        try {
            int nLines = GraphBuilderFromFile.count("/Users/lindseydew/Documents/workspace/min-cut/src/testdata.txt");
            Graph graph = GraphBuilderFromFile.fileRead("/Users/lindseydew/Documents/workspace/min-cut/src/testdata.txt", nLines);

            System.out.println(graph.toString());
            System.out.println(graph.toEdgeListString());
            System.out.println(graph.toAdjacencyListString());
            
//            Contract contract = new Contract();
//            Graph mergedGraph = contract.merge(new Edge(2,0), graph);
//
//            System.out.println(mergedGraph.toString());
//            System.out.println(mergedGraph.toEdgeListString());
//            System.out.println(mergedGraph.toAdjacencyListString());

            
        }
        catch (IOException e) {
            e.printStackTrace();
        }

//
//        try {
//            int nLines = GraphBuilderFromFile.count("/Users/lindseydew/Documents/workspace/min-cut/src/graphdata.txt");
//            Graph graph = GraphBuilderFromFile.fileRead("/Users/lindseydew/Documents/workspace/min-cut/src/graphdata.txt", nLines);
//
//            System.out.println(graph.toString());
//            System.out.println(graph.toEdgeListString());
//            System.out.println(graph.toAdjacencyListString());
//
//
//
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

    }




    //private int cutSet(graph) {

    //}
    
}
