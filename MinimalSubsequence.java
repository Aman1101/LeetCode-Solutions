import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimalSubsequence {

    public List<Integer> Test(List<Character> inputList){
        HashMap<Character, Integer> hmap = new HashMap<>();
        HashMap<Character, Integer> visited = new HashMap<>();
        List<Integer> res = new ArrayList<>();

            int count;
        for (int i =0; i<inputList.size(); i++){
            count = 0;
            if(hmap.containsKey(inputList.get(i)))
                count = hmap.get(inputList.get(i));

            hmap.put(inputList.get(i), ++count);
        }
        int sum = 0; int f = 0;
        for (int i =0; i<inputList.size(); i++){

            if(visited.containsKey(inputList.get(i)))
                sum -=1;
            else {
                visited.put(inputList.get(i),i);
                sum += hmap.get(inputList.get(i)) - 1;
            }
            if(sum == 0){
                int g = i+1 - f;
                f += g;
                res.add(g);
            }
        }
        return res;
    }


    public static void main(String[] args) {

        MinimalSubsequence obj = new MinimalSubsequence();
        List<Character> inputList = new ArrayList<>();

        inputList.add('a');
        inputList.add('b');
        inputList.add('a');
        inputList.add('b');
        inputList.add('c');
        inputList.add('b');
        inputList.add('a');
        inputList.add('c');
        inputList.add('a');
        inputList.add('d');
        inputList.add('i');
        inputList.add('j');
        inputList.add('d');

        inputList.add('z');
        inputList.add('z');
        inputList.add('z');
        inputList.add('a');
        inputList.add('b');
        inputList.add('a');
        inputList.add('e');
        inputList.add('f');
        inputList.add('e');
        inputList.add('e');
        System.out.println(obj.Test(inputList));
    }
}
