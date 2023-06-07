package zadatak1;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch1000nums {

    public static int[] generateRandomArray(int length, int range) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(range) + 1;
        }
        Arrays.sort(array);
        return array;
    }

    public static int binarySearch(int[] array, int numToSearch) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = array[mid];

            if (midValue < numToSearch) {
                low = mid + 1;
            } else if (midValue > numToSearch) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
