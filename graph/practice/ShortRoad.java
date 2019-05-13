package graph.practice;

import java.util.*;
import java.util.stream.Collectors;

class Edge{
    int s;
    int dest;
    int w;

    public Edge(int s, int dest, int w) {
        this.s = s;
        this.dest = dest;
        this.w = w;
    }

}

public class ShortRoad {

    public static List<String> classifyEdges(int gNodes,List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight){
        List<String> result=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();

        PriorityQueue<Edge> pq=new PriorityQueue<>(gFrom.size(),Comparator.comparingInt(o->o.w));
        PriorityQueue<Edge> pqnew=new PriorityQueue<>(Comparator.comparingInt(o->o.w));
        int minPath=Integer.MAX_VALUE;
        int currEnd=1;
        for(int i=0;i<gFrom.size();i++){
            //Edge e=new Edge(gFrom.get(i),gTo.get(i),gWeight.get(i));
            //pq.add(e);
            map.put(""+gFrom.get(i)+gTo.get(i),gWeight.get(i));
            if(gFrom.get(i)==1 && gTo.get(i)==gNodes && gWeight.get(i)<minPath){
               // minPath=gWeight;
            }
        }

        Set<String> set=map.keySet().stream().filter(s->s.startsWith("1")).collect(Collectors.toSet());

        for(String str1:set){
           // map
        }



        /*HashSet<Integer> currentTravel=new HashSet<>();
        currentTravel.add(1);

        while(!pq.isEmpty()){
            Edge e=pq.poll();

            if(e.s==1 && e.dest==gNodes){
                if(e.w<=minPath){
                    minPath=e.w;
                    currentTravel.add(e.s);
                    currentTravel.add(e.dest);
                }
                else{

                }
            }
            else if(e.s==1){
                if(e.w<=minPath){
                    minPath=e.w;
                }
                else{

                }
            }
        }*/




        return result;
    }
    public static void main(String[] args) {

    }
}
