package zadatak2;

import java.util.Arrays;

import zadatak1.MaxInArr;

public class App {

	public static void main(String[] args) {

		int maxi;
		int idx;

		int [] arr = MaxInArr.genArrInt(10);

		maxi = MaxInArr.returnMaxi(arr);
		idx = SelectionSort.getIdxMax(arr);
		System.out.println("Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Max: " + maxi);
		System.out.println("Idx position of the max in original array: " + idx);
		System.out.println("Sorted generated array: ");
		System.out.println(Arrays.toString(SelectionSort.SortSwap(arr)));

		int[] unsorted = {28,11,44,12,87,33};
		int [] sorted = SelectionSort.SortSwap(unsorted);

		System.out.println("Sorted: ");
		System.out.println(Arrays.toString(sorted));

	}

}