package zadatak2;

import zadatak1.AuxCls;

public class AuxClsExt extends AuxCls {
    
    public static int[] swapElement(int[] arr, int index) {

		int temp;

		if(index == arr.length-1) {
			return arr;
		} else {
			temp = arr[arr.length-1];
			arr[arr.length-1] = arr[index];
			arr[index] = temp;
			return arr;
		}

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
