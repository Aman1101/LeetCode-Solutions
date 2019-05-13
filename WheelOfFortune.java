import java.lang.reflect.Array;
import java.util.*;

public class WheelOfFortune {

    public static List<String> generatePhrase(List<String> phrases){

        HashMap<String, List<Integer>> hs = new HashMap<>();
        List<String> result = new ArrayList<>();

        if(phrases.size() >= 2) {

            for (int i = 0; i < phrases.size(); i++) {
                String str = phrases.get(i).substring(0, phrases.get(i).indexOf(" "));
                List<Integer> temp = new ArrayList<>();
                if (hs.containsKey(str))
                    temp = hs.get(str);

                temp.add(i);
                hs.put(str, temp);
            }

            for (int i = 0; i < phrases.size(); i++) {

                String s = phrases.get(i).substring(phrases.get(i).lastIndexOf(" ") + 1);

                if (hs.containsKey(s)) {
                    List<Integer> j = hs.get(s);
                    for (int k : j) {
                        if(k != i) {
                            StringBuilder st = new StringBuilder();
                            st.append(phrases.get(i).substring(phrases.get(i).lastIndexOf(" ") + 1));
                            st.append(phrases.get(k));
                            result.add(st.toString());
                        }
                    }


                }

            }
        }
        return result;
    }
    public static void main(String args[]){


        List<String> phrases = Arrays.asList("mission statement", "a quick bite to eat", "a chip off the old block","chocolate bar", "mission impossible mission");
        //List<String> phrases = Arrays.asList("mission on a statement mission");
        System.out.println(generatePhrase(phrases));
    }
}
