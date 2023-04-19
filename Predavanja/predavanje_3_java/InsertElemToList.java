import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class InsertElemToList {

    private static final int MININT = 0;
    private static final int MAXINT = 100;

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

    public static int[] insertElement(int element, int pos, int[] actualArr) {
        int lenOld = actualArr.length;
        int[] arrNew = new int[lenOld+1];
        //int[] copyBefore = Arrays.copyOfRange(actualArr, 0, pos-1);
        //int[] copyAfter = Arrays.copyOfRange(actualArr, pos, lenOld);
        arrNew[pos] = element;
        copyToArr(arrNew, actualArr, pos);

        
        return arrNew;
    }


    private static int[] copyToArr(int[] copyTo, int[] copyFrom, int startPos){
        for (int i = 0; i < startPos; i++) {
            copyTo[i] = copyFrom[i];
        }

        for (int i = startPos; i < copyFrom.length; i++) {
            copyTo[i+1] = copyFrom[i];
        }
        return copyTo;
    }
}
