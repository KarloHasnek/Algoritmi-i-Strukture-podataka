package zadatak1;

import java.util.concurrent.ThreadLocalRandom;

public class MaxInArr {

    public static int[] genArrInt(int N) {
		int [] intArr = new int[N];

		for(int k = 0; k < N; k++) {
			intArr[k] = ThreadLocalRandom.current().nextInt(0, 301);
		}

		return intArr;
	}

	public static int returnMaxi(int [] arr) {

		int maxi = arr[0];
		int res = 1;

		while (res < arr.length) {
			if(maxi < arr[res]) {
				maxi = arr[res];
				res +=1;
			}else {
				res += 1;
			}
		}


		return maxi;
	}
}
