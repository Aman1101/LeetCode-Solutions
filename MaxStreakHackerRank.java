import java.util.ArrayList;
import java.util.List;

public class MaxStreakHackerRank {

    public static int maxStreak (int m, List<String>data){

        int count =0; int maxCount =0;
        StringBuilder s = new StringBuilder(m);
        for(int i=0;i<m;i++){
            s.append("Y");
        }
        for (String item : data){
            if(item.equals(s.toString())){
                count++;
                maxCount = Math.max(maxCount,count);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int m =4;
        List<String> list = new ArrayList<>();

        list.add("YNYY");
        list.add("YYYY");
        list.add("YYYY");
        list.add("YYNY");
        list.add("NYYN");
        //list.add("NN");
        System.out.println(maxStreak(m,list));
    }
}
