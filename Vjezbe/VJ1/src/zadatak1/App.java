package zadatak1;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		int maxi;

		int [] arr = MaxInArr.genArrInt(10);

		maxi = MaxInArr.returnMaxi(arr);

		System.out.println("Generated array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Max in array is: " + maxi);

	}

}