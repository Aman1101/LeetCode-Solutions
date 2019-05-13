public class LastLetters {

    public static String lastLetters(String word){

        StringBuilder builder  = new StringBuilder(3);
        builder.append(word.charAt(word.length()-1));
        builder.append(" ");
        builder.append(word.charAt(word.length()-2));

        return builder.toString();

    }

    public static void main(String[] args) {


        System.out.println(lastLetters("APPLE"));
    }
}
