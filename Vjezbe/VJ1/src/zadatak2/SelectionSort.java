package zadatak2;

import java.util.Arrays;
import zadatak1.MaxInArr;

public class SelectionSort {
    
    public static int getIdxMax(int[] arr) {

        int maxi = arr[0];
        int idx = 0;
        int res = 1;

        while (res < arr.length) {
            if(maxi < arr[res]) {
                maxi = arr[res];
                idx = res;
                res +=1;
            }else {
                res += 1;
            }
        }

        return idx;
    }

    public static int[] SortSwap(int[] arr) {

        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];
            int maxi = MaxInArr.returnMaxi(Arrays.copyOfRange(arr, i, arr.length));
            int idx = getIdxMax(Arrays.copyOfRange(arr, i, arr.length))+i;
            arr[i] = maxi;
            arr[idx] = temp;

        }

        long stopTime = System.nanoTime();
		System.out.println("Elapsed time with swapping max value algorithm: " + (stopTime - startTime));
        return arr;
    }
}
