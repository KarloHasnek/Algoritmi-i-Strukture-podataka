import java.util.Arrays;

public class BinarySearch {
    
    public static boolean binarySearchIter(int[] arr, int val){
        Arrays.sort(arr);
        boolean status = false;

        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int middlePoint = (right + left)/2;
            if (arr[middlePoint] == val){
                System.out.println("Value is in array: " + val);
                status = true;
                break;
            }else{
                if (arr[middlePoint] > val){
                    right = middlePoint-1;
                }else{
                    left = middlePoint+1;
                }
            }
        }
        return status;
    }
}
