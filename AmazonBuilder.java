import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AmazonBuilder {

    int minimumTime(int numOfParts, List<Integer> parts){

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        int total = 0;
        //Adding list in Queue to get later the minimum number from top
        for(int i : parts){
            pQueue.add(i);
        }
        //Run loop till there are more than 1 element in the queue, because the last element need not to
        //be merged with any other part
        while(pQueue.size()>1){
            //Getting the first part with the least time
            int firstPart = pQueue.poll();
            //Getting the second part with the least time
            int secondPart = pQueue.poll();
            //Calculating the time to assemble the two parts
            int sum = firstPart + secondPart;
            //Adding back the assembled part in the queue
            pQueue.add(sum);
            //Storing the intermediate sums to find the final sum.
            total += sum;
        }
        //Returning the total time
        return total;
    }

    public static void main(String[] args) {
        int nParts = 4;
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(4);
        list.add(6);
        list.add(12);
        list.add(14);
        AmazonBuilder amazonBuilder = new AmazonBuilder();
        System.out.println(amazonBuilder.minimumTime(4, list));

    }
}
