import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RemElem {
    
    private static final int MININT = 0;
    private static final int MAXINT = 10;

    public static int[] genArrInt(int numElements) {
        int[] arr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            int num = ThreadLocalRandom.current().nextInt(MININT, MAXINT);
            arr[i] = num;
        }

        System.out.println("Generated array: ");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] removeElement(int element, int[] actualArr){
        for (int i = 0; i < actualArr.length; i++) {
            if (actualArr[i] == element)actualArr[i] = 000;
        }

        int[] newArr = new int[(actualArr.length)-1];

        for (int i = 0; i < newArr.length; i++) {
            if (actualArr[i] == 000){}
            else{
                newArr[i] = actualArr[i];
            }
        }

        return actualArr;
    }
}



// [2, 5, 10, 15, 20]
// remove(10)
// [2, 5, 15, 20]