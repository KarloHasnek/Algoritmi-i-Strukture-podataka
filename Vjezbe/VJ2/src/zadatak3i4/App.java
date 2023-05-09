package zadatak3i4;

import java.util.Arrays;

import zadatak2.AuxClsExt;

public class App {

    public static void main(String[] args) {

        int[] arr = AuxClsExt.genArrInt(7);
        System.out.println("<<<<<<<<<<<<<<<<< Original Array >>>>>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName() + "@" + Integer.toHexString(Arrays.hashCode(arr)));
        arr = AuxClsExt.insertElement(15, 4, arr);
        System.out.println("<<<<<<<<<<<<<<<<< After inserting >>>>>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName() + "@" + Integer.toHexString(Arrays.hashCode(arr)));

	}

}