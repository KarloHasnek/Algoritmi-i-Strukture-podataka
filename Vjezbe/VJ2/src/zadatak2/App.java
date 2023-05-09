package zadatak2;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] arr = AuxClsExt.genArrInt(7);
        System.out.println("<<<<<<<<<<<<<<<<< Original Array >>>>>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName() + "@" + Integer.toHexString(Arrays.hashCode(arr)));
        // apply swapping algorithm
        arr = AuxClsExt.swapElement(arr, 2);
        System.out.println("<<<<<<<<<<<<<<<<< After swaping >>>>>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName() + "@" + Integer.toHexString(Arrays.hashCode(arr)));
        // remove using copyOf
        arr = Arrays.copyOf(arr, arr.length-1);
        System.out.println("<<<<<<<<<<<<<<<<< After copyOf >>>>>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName() + "@" + Integer.toHexString(Arrays.hashCode(arr)));

	}
}
