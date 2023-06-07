package zadatak4_zadatak5_zadatak7;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayShuffle {

    public static <T> T[] shuffleArray(T[] array) {

        Random random = new Random();
        Set<Integer> indexSet = new HashSet<>();

        T[] shuffledArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(array.length);
            } while (indexSet.contains(randomIndex));
            indexSet.add(randomIndex);

            shuffledArray[i] = array[randomIndex];
        }

        return shuffledArray;
    }

    public static <T extends Comparable<T>> T[] sortShuffledArray(T[] shuffledArray) {
        TreeSet<T> sortedSet = new TreeSet<>(Arrays.asList(shuffledArray));
        return sortedSet.toArray(shuffledArray);
    }

    public static <T> void checkDuplicates(List<T> list) {

        Set<T> uniqueElements = new HashSet<>();
        Set<T> duplicateElements = new HashSet<>();

        System.out.println("Original list: " + list.toString());

        for (T element : list) {
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }

        System.out.println("Unique elements: " + uniqueElements);
        System.out.println("Duplicate elements: " + duplicateElements);
    }

    public static List<Integer> generateRandomList(int size, int max) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(ThreadLocalRandom.current().nextInt(0, max + 1));
        }

        return list;
    }
}

