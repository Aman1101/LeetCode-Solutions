import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JunctionBoxes {

    public List<String> orderedJunctionBoxes(int numberOfBoxes, List<String> boxList){

        List<String> oldBoxes = new ArrayList<>();
        List<String> newBoxes = new ArrayList<>();


        for (String tempString : boxList) {
            //String temp = tempString.substring(0, tempString.indexOf(" "));
            String temp1 = tempString.substring(tempString.indexOf(" ") +1);
            if (temp1.matches(".*\\d+.*")){
                newBoxes.add(tempString);
            }else{
                oldBoxes.add(tempString);
            }
        }

        Comparator<String> comparator = (o1, o2) ->{
            String o11 = o1.substring(0, o1.indexOf(" "));
            String o12 = o1.substring(o1.indexOf(" ") +1, o1.length());
            String o21 = o2.substring(0, o2.indexOf(" "));
            String o22 = o2.substring(o2.indexOf(" ") +1, o2.length());

            if (o12.compareTo(o22) != 0){
                return o12.compareTo(o22);
            }else {
                return o11.compareTo(o21);
            }
        };

        Collections.sort(oldBoxes, comparator);

       oldBoxes.addAll(newBoxes);

        return oldBoxes;

    }


    public static void main(String[] args) {

        int numberOfBoxes=6;
        List<String> boxList=new ArrayList<>();
        boxList.add("ykc 82 0");
        boxList.add("eo first qpx");
        boxList.add("09z cat hamster");
        boxList.add("06f 12 25 6");
        boxList.add("az0 first qpx");
        boxList.add("236 cat dog rabbit snake");

        System.out.println(new JunctionBoxes().orderedJunctionBoxes(numberOfBoxes, boxList));

    }
}
