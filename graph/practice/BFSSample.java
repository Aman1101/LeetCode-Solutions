package graph.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSSample {

    private int v;
    private LinkedList<Integer> adjList [];


    public BFSSample(int v) {
        this.v = v;
        adjList = new LinkedList[v];
        for (int i=0; i < v; i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge (int src, int dest){
        adjList[src].add(dest);
    }

    void bfs(int startVertex){
        boolean visited[] = new boolean[v];
        Queue<Integer> tempQueue = new LinkedList<>();

        visited[startVertex] = true;
        tempQueue.add(startVertex);

        while (!tempQueue.isEmpty()){
            startVertex = tempQueue.poll();
            System.out.println(startVertex + "  ");

            Iterator<Integer> iterator = adjList[startVertex].iterator();

            while (iterator.hasNext()){
                int n = iterator.next();
                if (!visited[n]){
                    visited[n] = true;
                    tempQueue.add(n);
                }

            }
        }
    }



    public static void main(String[] args) {

        BFSSample g = new BFSSample(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.bfs(2);
    }

}
