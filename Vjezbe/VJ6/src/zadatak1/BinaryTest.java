package zadatak1;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static zadatak1.BinarySearch1000nums.binarySearch;
import static zadatak1.BinarySearch1000nums.generateRandomArray;

public class BinaryTest {

    private static final int NUM_ARRAYS = 1000;
    private static final int ARRAY_LENGTH = 100;
    private static final int SEARCH_RANGE = 100;

    private static Random random = new Random();
    private static long userBinarySearchTimer = 0;
    private static long javaBinarySearchTimer = 0;

    public static void main(String[] args) {

            for (int i = 0; i < NUM_ARRAYS; i++) {
                int[] randomArray = generateRandomArray(ARRAY_LENGTH, SEARCH_RANGE);
                int numToSearch = random.nextInt(SEARCH_RANGE) + 1;

                // Testing user made method
                long startTime = System.nanoTime();
                int yourResult = binarySearch(randomArray, numToSearch);
                long endTime = System.nanoTime();

                long yourExecutionTime = endTime - startTime;
                userBinarySearchTimer += yourExecutionTime;

                // Testing JAVA API method
                startTime = System.nanoTime();
                int javaResult = Arrays.binarySearch(randomArray, numToSearch);
                endTime = System.nanoTime();

                long javaExecutionTime = endTime - startTime;
                javaBinarySearchTimer += javaExecutionTime;
            }

            System.out.println("User made binary search time: " + userBinarySearchTimer + " ns");
            System.out.println("JAVA API  binary search time: " + javaBinarySearchTimer + " ns");
        }
    }