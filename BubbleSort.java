import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 1, 5, 4, 2, 0, 10, 20};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        int count = 0;
        boolean swapped;

        while (count < arr.length) {
            swapped = false;
            for (int i = 1; i < arr.length - count; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            count++;
        }
        return arr;
    }
}
