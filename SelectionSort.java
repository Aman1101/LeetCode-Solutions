import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 1, 5, 4, 2, 0, 10, 20};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        int count = 0;
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapArray(arr, maxIndex, last);
        }
        return arr;
    }

    static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max  = start;

        for (int j = start; j <= end; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }
}
