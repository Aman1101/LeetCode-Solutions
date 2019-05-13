import java.util.Iterator;
import java.util.TreeSet;

public class SortCommaSeperatedString {

    public static String sortString(String str){
        TreeSet<String> ts = new TreeSet<>();
        String[] s = str.split(",");
        for (int i = 0; i < s.length; i++){
            if (s[i].length()!= 4){
                ts.add(s[i].toUpperCase());
            }
        }
        StringBuilder builder = new StringBuilder();
        Iterator<String> itr = ts.iterator();

        while(itr.hasNext()){
            builder.append(itr.next());

            builder.append(",");
        }

        return builder.toString().substring(0, builder.lastIndexOf(","));
    }

    public static void main(String[] args) {
        String str = "aman,rushabh,karan,amit,sourabh,amana,amana";
        System.out.println(sortString(str));
    }
}
