import java.util.HashMap;

public class PalindromePermutation {

    public boolean checkPalindromePermutation(String str){
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            Integer c = hashMap.get(Character.toLowerCase(str.charAt(i)));
            if (hashMap.containsKey(Character.toLowerCase(str.charAt(i)))){
                hashMap.put(Character.toLowerCase(str.charAt(i)), ++c);
            }else{
                hashMap.put(Character.toLowerCase(str.charAt(i)), 1);
            }
        }
        boolean checker = false;
        for(Character c : hashMap.keySet()){
            if (hashMap.get(c)%2==1){
                if (checker){
                    return false;
                }
                checker = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "TACT coa";
        PalindromePermutation permutation = new PalindromePermutation();
        boolean result = permutation.checkPalindromePermutation(str);
        System.out.printf("" + result);
    }
}
