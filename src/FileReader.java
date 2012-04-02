import java.io.*;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: lindseydew
 * Date: 31/03/2012
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
public class FileReader {


    public static int count(String filename) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(filename));
        try {
            byte[] c = new byte[1024];
            int count = 1;
            int readChars = 0;
            while ((readChars = is.read(c)) != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n')
                        ++count;
                }
            }
            return count;
        } finally {
            is.close();
        }
    }

    public static Graph fileRead(String filename, int nLines) throws FileNotFoundException {
        Graph graph = new Graph(nLines);
        try {
            FileInputStream fstream = new FileInputStream(filename);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line;
//            ArrayList<String> vertices = new ArrayList<String>();
            int[] vertices = new int[nLines];

            //vertices
            int i = 0;
            //add condition not to be empty string
            while ((line = br.readLine()) != null ){

                    int[] numbersInLine = new int[line.split("\\s+").length];
                    int j = 0;
                    //populate the integer array
                    for (String s : line.split("\\s+")) {
                        int num = Integer.parseInt(s);
                        numbersInLine[j] = num;
                        j++;
                    }
                    //vertices
                    int vertex = numbersInLine[0];
                    vertices[i] = vertex;
                    System.out.println("vertex " + vertices[i]);
                    i++;

                    //edges

                    for (int w : numbersInLine) {
                        if (vertex > w) {
                            graph.addEdge(vertex, w);

                        }
                    }

                }

            in.close();


        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }


        return graph;
    }     

    
}

//        if (line != null) {
//            //read vertex
//            String[] vertexNames = line.split(" ");
//            int[] vertices = new int[vertexNames.length];
//            for (int i = 0; i < vertices.length; ++i) {
//                vertices[i] = Integer.parseInt(vertexNames[i]);
//            }
//
//            //create graph
//            Graph g = new Graph();
//
//            //read edges
//            while((line = br.readLine()) != null) {
//                String[] tokens = line.split(" ");
//                int v1 = Integer.parseInt(tokens[0]);
//                int v2 = Integer.parseInt(tokens[1]);
//
//
//                //we add neighbor to each node in both directions.
//                g.addNeighbor(v1, v2);
//                g.addNeighbor(v2, v1);
//            }
//
//        }
//        br.close();
//    }





