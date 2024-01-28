package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    private int V; // number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list representation

    public GraphBFS(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjList[i] = new LinkedList<>();
    }

    // Function to add an edge to the graph
    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Function for BFS traversal
    void BFS(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>(); // Create a queue for BFS

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Loop for searching the adjacent vertices
            for (int neighbor : adjList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // main
    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Starting vertex:");
        g.BFS(2);
    }
}
