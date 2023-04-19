import java.util.Arrays;

public class Test {
    
    public static void main(String[] args) {
        /*
        int[] arrOld = InsertElemToList.genArrInt(10);
        int[] arrInsert = InsertElemToList.insertElement(1000, 2, arrOld);
        System.out.println(Arrays.toString(arrInsert));
        
        int[] arrOldRemovable = RemElem.genArrInt(10);
        int[] arrRemove = RemElem.removeElement(4, arrOldRemovable);
        System.out.println(Arrays.toString(arrRemove));
        */

        int[] arr = {2, 3, 4, 5, 6, 8};
        boolean status = BinarySearch.binarySearchIter(arr, 3);
        System.out.println(status);
    }
}
