import java.util.Iterator;
import java.util.LinkedList;

public class DFSTraversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    @SuppressWarnings("unchecked")
    public DFSTraversal(int v) {
        adj = new LinkedList[v];
        visited = new boolean[v];

        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int src, int dest) {
        adj[src].add(dest);
    }

    public void DFS(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> it = adj[v].listIterator();

        while(it.hasNext()) {
            int n = it.next();
            if(!visited[n]) {
                DFS(n);
            }
        }
    }
}
