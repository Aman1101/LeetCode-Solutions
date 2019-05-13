import java.util.HashMap;

public class HashMapDemo {

    HashMap<Integer, Integer> hmap = new HashMap<>();

    public void demoFunction(int nums[]){

        for (int i =0; i<nums.length; i++){

            Integer c = hmap.get(nums[i]);

            if (hmap.containsKey(nums[i])){

                hmap.put(nums[i], ++c);
            }else {
                hmap.put(nums[i],1);
            }
        }

        for (int i :hmap.keySet()
             ) {
            System.out.println( i + " Value ->" + hmap.get(i));
        }
    }

    public static void main(String[] args) {
        int nums[] = {10,20,30,10,20,40};
        HashMapDemo hd = new HashMapDemo();
        hd.demoFunction(nums);
    }
}
