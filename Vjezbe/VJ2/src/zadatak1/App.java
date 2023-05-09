package zadatak1;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] arr = AuxCls.genArrInt(5);
        System.out.println("<<<<<<<<<<<<<<<<< Original Array >>>>>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName() + "@" + Integer.toHexString(arr.hashCode()));
        arr = AuxCls.removeElement(3, arr);
        System.out.println("<<<<<<<<<<<<<<<<< After DeleteOne >>>>>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName() + "@" + Integer.toHexString(arr.hashCode()));
	}
}
