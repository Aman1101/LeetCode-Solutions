package graph.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSSample {
/*  This program consists of basic DFS implementation and code to check,
    if the two nodes are on the same path of  graph/tree.*/
    private int v;
    private LinkedList<Integer> adjList [];


    public DFSSample(int v) {
        this.v = v;
        adjList = new LinkedList[v];
        for (int i=0; i < v; i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge (int src, int dest){
        adjList[src].add(dest);
    }

    void dfs(int startVertex){
        boolean visited[] = new boolean[v];

        dfsUtil(startVertex, visited);
    }

    int []inTime = new int[200];
    int []outTime = new int[200];
    int timer = 0;

    void dfsUtil(int vertex, boolean visited[]){

        visited[vertex] = true;
        System.out.print(vertex + "  ");
        timer++;
        inTime[vertex] = timer;

        Iterator<Integer> iterator = adjList[vertex].iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if (!visited[n]){
                dfsUtil(n, visited);
            }
        }
        timer++;
        outTime[vertex] = timer;


    }

    boolean queryResult(int firstNode, int secondNode){
        return ( (inTime[firstNode]<inTime[secondNode] && outTime[firstNode]>outTime[secondNode]) ||
                (inTime[secondNode]<inTime[firstNode] && outTime[secondNode]>outTime[firstNode]));
    }

    public static void main(String[] args) {
        DFSSample g = new DFSSample(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");
        g.dfs(2);

        System.out.println("\nResult if the nodes are on same path : "+g.queryResult(1,3));

    }
}
