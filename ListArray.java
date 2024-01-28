package Tree;
import java.util.ArrayList;
import java.util.List;

class Graph
{
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    // constructor
    public Graph(int numVertices)
    {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);

        // loop for no.of vertices
        for(int i = 0; i < numVertices; i++)
        {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdges(int source, int destination)
    {
        // Undirected graph
        // when we use get method, the add in line 20 becomes setter
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    // Method for graph value
    public void graphPrint()
    {
        System.out.println("Graph: ");

        // loop for checking the adjacent with near vertex
        for(int i = 0; i < numVertices; i++)
        {
            System.out.print("Vertex " + i + ": ");
            // foreach loop for encapsulation
            for(Integer near : adjacencyList.get(i))
            {
                System.out.print(near + " ");
            }
            System.out.println();
        }
    }
}

// Main class
public class ListArray {

    public static void main(String[] args) {
        // Object subclass Graph
        Graph grp = new Graph(5);
        // edges
        grp.addEdges(1, 3);
        grp.addEdges(0, 2);
        grp.addEdges(1, 4);
        grp.addEdges(0, 4);
        grp.addEdges(2, 3);

        // invoking the graph method
        grp.graphPrint();
    }
}