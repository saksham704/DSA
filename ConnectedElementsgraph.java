import java.util.*;
public class ConnectedElementsgraph {
    int V;
    List<List<Integer>> adj;
    ConnectedElementsgraph(int V){
        this.V = V;
        adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void DFS(int node, boolean vis[]){
        vis[node] = true;
        for(int neighbour : adj.get(node)){
             if(!vis[neighbour]){
                DFS(neighbour, vis);
            }
        }
    }
        int connectedcomponents(){
            boolean vis[] = new boolean[V];
            int count = 0;
            for(int i=0; i<V; i++){
                if(!vis[i]){
                    DFS(i, vis);
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
            ConnectedElementsgraph g = new ConnectedElementsgraph(7);
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(3, 4);
            g.addEdge(5, 6);
            System.out.println("Number of connected components: " + g.connectedcomponents());
        }
    }