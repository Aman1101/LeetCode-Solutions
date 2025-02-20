import java.util.Arrays;

// Rows are sorted and columns are sorted
public class BinarySearch2DSortedArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(searchIn2DSortedArray(arr, 7)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] {row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] searchIn2DSortedArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, columns - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = columns / 2;

        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        if (matrix[rStart][cMid] == target) {
            return new int[] {rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] {rStart + 1, cMid};
        }

        if (matrix[rStart][cMid - 1] >= target) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (matrix[rStart][cMid + 1] <= target && target <= matrix[rStart][columns - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, columns - 1, target);
        }
        if (matrix[rStart + 1][cMid - 1] >= target) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, columns - 1, target);
        }
    }
}
