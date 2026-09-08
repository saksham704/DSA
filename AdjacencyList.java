import java.util.*;

public class AdjacencyList {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String args[]) {

        int V = 5;

        // Create array of ArrayLists
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize each list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 3, 8));

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 4, 2));

        // Print adjacency list
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");

            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + "," + e.wt + ") ");
            }

            System.out.println();
        }
    }
}
