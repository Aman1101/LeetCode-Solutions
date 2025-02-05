import java.util.Arrays;
// Rows are sorted and columns are sorted
public class BinarySearch2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(searchIn2DSortedArray(arr, 51)));
    }

    static int[] searchIn2DSortedArray(int[][] matrix, int target) {
        int rstart = 0;
        int column = matrix.length - 1;

        while (rstart < matrix.length && column >= 0) {
            if (matrix[rstart][column] == target) {
                return new int[] {rstart, column};
            } else if (matrix[rstart][column] > target) {
                column--;
            } else {
                rstart++;
            }
        }
        return new int[] {-1, -1};
    }
}
