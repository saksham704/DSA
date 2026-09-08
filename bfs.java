import java.util.*;

public class bfs {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph) {

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

        q.add(0);

        while (!q.isEmpty()) {

            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (Edge e : graph[curr]) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 3, 8));

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 4, 2));

        bfs(graph);
    }
}