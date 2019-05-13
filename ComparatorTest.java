import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(1);
        list.add(6);
        list.add(30);
        list.add(40);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(10);


        //Comparator<Integer> cmp = ;

        Collections.sort(list, (o1,o2) -> o1.compareTo(o2));

        System.out.println(list);


    }

}
