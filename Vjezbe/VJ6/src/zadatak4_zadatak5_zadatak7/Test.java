package zadatak4_zadatak5_zadatak7;

import java.util.Arrays;
import java.util.List;

import static zadatak4_zadatak5_zadatak7.ArrayShuffle.*;

public class Test {

    public static void main(String[] args) {

        Integer[] numbers = {5, 13, 7, 2, 9, 4, 1, 8, 3, 6, 12, 10, 11};
        Integer[] shuffledNumbers = shuffleArray(numbers);
        System.out.println("Array of integers before shuffle:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Array of integers after shuffle:");
        System.out.println(Arrays.toString(shuffledNumbers));
        System.out.println("Array of integers after sorting shuffled array:");
        System.out.println(Arrays.toString(ArrayShuffle.sortShuffledArray(shuffledNumbers)));

        System.out.println("---------------------------------------------------------------------");

        String[] strings = {"a", "g", "c", "k", "e", "z", "i", "b", "f", "d", "j", "h"};
        String[] shuffledStrings = shuffleArray(strings);
        System.out.println("Array of strings before shuffle:");
        System.out.println(Arrays.toString(strings));
        System.out.println("Array of strings after shuffle:");
        System.out.println(Arrays.toString(shuffledStrings));
        System.out.println("Array of strings after sorting shuffled array:");
        System.out.println(Arrays.toString(ArrayShuffle.sortShuffledArray(shuffledStrings)));

        System.out.println("---------------------------------------------------------------------");

        List<Integer> randomList = generateRandomList(10, 20);
        checkDuplicates(randomList);
    }
}
