import java.util.HashMap;

public class SingleNumber136 {

    HashMap<Integer, Integer> hmap = new HashMap<>();

    public int singleNumber(int nums[]){

        for (int i =0; i<nums.length; i++){

            Integer c = hmap.get(nums[i]);

            if (hmap.containsKey(nums[i])){

                hmap.put(nums[i], ++c);
            }else {
                hmap.put(nums[i],1);
            }
        }

        int result = 0;
        for (int i :hmap.keySet()
        ) {
            if(hmap.get(i)==1){
                result = i;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {10,20,30,10,20,40};
        SingleNumber136 sg= new SingleNumber136();
        int result = sg.singleNumber(nums);
        System.out.println(result);
    }

    }
