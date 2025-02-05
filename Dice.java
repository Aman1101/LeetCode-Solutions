import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dicePerm("", 4));
    }

    static ArrayList<String> dicePerm(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(dicePerm(p + i, target - i));
        }
        return list;
    }
}
