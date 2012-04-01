/**
 * Created by IntelliJ IDEA.
 * User: lindseydew
 * Date: 31/03/2012
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
public class MinimumCut {
    
    public static void main (String[] args) {
        System.out.println("hello world");


        //data = new filereader(..path..);
        //Contract graph = new Contract(data);
        //minGraph = Contract.contract(graph)
        //int numEdges = cutSet(minGraph)
        //System.out.println(numEdges)

        Graph graph = new Graph(4, 5);
//        int edge = graph.chooseEdgeAtRandom();
//        System.out.println("edge " + edge);
        System.out.println(graph.toString());
        System.out.println(graph.toArrayListString());
        
        graph.removeSelfLoops();

        System.out.println(graph.toString());
        System.out.println(graph.toArrayListString());

        
        
    }




    //private int cutSet(graph) {

    //}
    
}
