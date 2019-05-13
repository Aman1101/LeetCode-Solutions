import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Paras_before_After_phrases {


    public static List<String> getPhrases(List<String> phrases) {

        List<String> result = new ArrayList<String>();
        HashMap<String, List<Integer>> hm = new HashMap();

        for (int i = 0; i < phrases.size(); i++) {

            String firstword = phrases.get(i).split(" ")[0];

            if (hm.containsKey(firstword)) {
                hm.get(firstword).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                hm.put(firstword, indexList);
            }
        }

        for (int i = 0; i < phrases.size(); i++) {

            String lastword = phrases.get(i).substring(phrases.get(i).lastIndexOf(" ") + 1);
            if (hm.containsKey(lastword)) {

                List<Integer> associatedIndex = hm.get(lastword);
                String appendedString;
                for (int j = 0; j < associatedIndex.size(); j++) {
                    String secondString = phrases.get(associatedIndex.get(j));
                    appendedString = phrases.get(i)+" "+ secondString.substring(secondString.indexOf(" ")+1) ;
                    result.add(appendedString);

                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("mission statement");
        list.add("a man on a mission");
        list.add("block party");
        list.add("old block");
        list.add("choc bar");
        list.add("bar of soap");

        System.out.println(getPhrases(list));
    }
}
