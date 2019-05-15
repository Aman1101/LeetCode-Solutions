import java.util.*;

public class WarehouseBagPrioritization {

    static String firstBag(String[] bags){

        HashMap<String, Integer> hMap = new HashMap<>();

        for(String s: bags){
            hMap.put(s, hMap.getOrDefault(s, 0)+1);
        }

        PriorityQueue<String> pQueue = new PriorityQueue<>(
                (w1,w2) -> hMap.get(w1).equals(hMap.get(w2)) ?
                        w1.compareTo(w2): hMap.get(w2) - hMap.get(w1) );

        for(String str: hMap.keySet()){
            pQueue.add(str);
        }

        List<String> list = new ArrayList<>();

        while(!pQueue.isEmpty()){
            list.add(pQueue.poll());
        }

        //Collections.reverse(list);

        return list.get(0);

    }

    public static void main(String[] args) {

        String[] bags = {"10","bagX","bagA","bagA","bagA","bagE","bagX","bagA","bagX","bagB","bagB","bagB"};

        System.out.println(firstBag(bags));

    }
}
