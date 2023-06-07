public class Main {
    public static void main(String[] args) {
        BFSTraversal graphBFS = new BFSTraversal(6);

        graphBFS.insertEdge(0, 1);
        graphBFS.insertEdge(0, 3);
        graphBFS.insertEdge(0, 4);
        graphBFS.insertEdge(4, 5);
        graphBFS.insertEdge(3, 5);
        graphBFS.insertEdge(1, 2);
        graphBFS.insertEdge(1, 0);
        graphBFS.insertEdge(2, 1);
        graphBFS.insertEdge(4, 1);
        graphBFS.insertEdge(3, 1);
        graphBFS.insertEdge(5, 4);
        graphBFS.insertEdge(5, 3);

        System.out.println("Breadth First Traversal for the graph is:" );
        graphBFS.BFS(0);

        System.out.println("\n================================================");

        DFSTraversal graphDFS = new DFSTraversal(8);

        graphDFS.insertEdge(0, 1);
        graphDFS.insertEdge(0, 2);
        graphDFS.insertEdge(0, 3);
        graphDFS.insertEdge(1, 3);
        graphDFS.insertEdge(2, 4);
        graphDFS.insertEdge(3, 5);
        graphDFS.insertEdge(3, 6);
        graphDFS.insertEdge(4, 7);
        graphDFS.insertEdge(4, 5);
        graphDFS.insertEdge(5, 2);

        System.out.println("Deep First Traversal for the graph is:" );
        graphDFS.DFS(0);

        System.out.println();
    }
}
