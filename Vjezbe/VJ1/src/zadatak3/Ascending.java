package zadatak3;

public class Ascending {
    
    public static int[] ascendingOrderSort(int[] arr) {

        long startTime = System.nanoTime();
		int temp;

		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j < arr.length; j++) {

				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

        long stopTime = System.nanoTime();
        System.out.println("Elapsed time with ascending order algorithm: " + (stopTime - startTime));
		return arr;
	}

}
