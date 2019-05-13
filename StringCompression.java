public class StringCompression {

    public String compressString(String str){
        StringBuilder stringBuilder = new StringBuilder();
        int count =1;

        for(int i=0; i < str.length(); i++){
            //count++;
            if((i+1) >= str.length() || str.charAt(i) != str.charAt(i+1)){
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(count);
                count=1;
            }else{
                count++;
            }
        }
        if (stringBuilder.length() >= str.length()){
            return str;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "aabbcccdd";
        StringCompression compression = new StringCompression();
        System.out.println(compression.compressString(str));
    }
}
