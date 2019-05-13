import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JackNJillCommonWords {

    public static List<String> mostCommonWord(String paragraph, String[] banned) {

        List<String> resList = new ArrayList<>();
        String newP = paragraph.toLowerCase();
        newP = newP.replaceAll("[^a-z]+", " ");
        String pArray[] = newP.split(" ");
        //System.out.println(pArray);
        /*for(String a1 : pArray){
            System.out.println(a1);
        }
*/
        HashMap<String, Integer> hMap = new HashMap<>();

        for(String s: pArray){
            if(!hMap.containsKey(s)){
                hMap.put(s, 1);
            }else{
                int i = hMap.get(s);
                hMap.put(s, ++i);
            }

            // hMap.put(s, hMap.getOrDefault(s, 0) + 1);
        }

        for(int i = 0; i < banned.length; i++){
            String temp = banned[i].toLowerCase();
            if(hMap.containsKey(temp)){
                hMap.remove(temp);
            }
        }

        int max = 0;
        //String maxWord = "";

        for(String s : hMap.keySet()){
            if(hMap.get(s)>max){
                max = hMap.get(s);
                //maxWord = s;
            }
        }

        for(String s : hMap.keySet()){
            if(hMap.get(s)== max){
                resList.add(s);
                //maxWord = s;
            }
        }
        return resList;
    }

    public static void main(String[] args) {
        //String para = "Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food.";
        String para = "Rose is a flower red rose are flower";
        //String[] banned = {"and","he","the","to","is","Jack","Jill"};
        String[] banned = {"is", "are", "a"};
                System.out.println(JackNJillCommonWords.mostCommonWord(para, banned));


    }

}
