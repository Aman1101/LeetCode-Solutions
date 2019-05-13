import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        if(nums == null || nums.length == 0){
            return -1;
        }
        Arrays.sort(nums);
        return helper(0, nums.length-1, nums, target);

    }

    public int helper(int start, int end, int[] nums, int target){
        if(end>=start) {


            int mid = (start + end) / 2;

            if (target > nums[mid]) {
                return helper(mid + 1, end, nums, target);
            } else if (target < nums[mid]) {
                return helper(start, mid - 1, nums, target);
            } else if (target == nums[mid]) {
                return mid;
            }
        }
        return -1;
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);

            int ret = new SearchInRotatedSortedArray().search(nums, target);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }

}
