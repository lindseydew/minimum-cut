package src;

/**
 * Created by IntelliJ IDEA.
 * User: lindseydew
 * Date: 02/04/2012
 * Time: 09:38
 * To change this template use File | Settings | File Templates.
 */
public class Edge {
    int u;
    int v;
    
    public Edge(int u, int v) {
         this.u = u;
         this.v = v;
        
    }
    
    public int getU() { return u; }
    
    public int getV() { return v; }
    
    
    public String edgeToString() {
        StringBuilder s = new StringBuilder();
        s.append("u = " + getU());
        s.append(" v = " + getV());
        return s.toString();
    }
}
