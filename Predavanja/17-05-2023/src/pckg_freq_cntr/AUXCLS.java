package pckg_freq_cntr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AUXCLS {

    public static HashMap<Integer, Integer> wordLengthCounter(ArrayList<String> text, int[] length) {
        HashMap<Integer, Integer> freqCounter = new HashMap<>();
        for (int num : length) {
            freqCounter.put(num, 0);
        }
        for (String line : text) {
            String[] words = line.split(" ");
            System.out.println(Arrays.toString(words));
            for (String word : words) {
                for (int num : length) {
                    if (num == word.length()){
                        // .put(k, v) -> assigns value to key
                        // .get(k) -> gets value of given key
                        int value = freqCounter.get(num) + 1;
                        freqCounter.put(num, value);
                        break;
                    }
                }
            }
        }

        return freqCounter;
    }

    public static boolean fileExists(String filePath) {
        File file = new File(filePath);
        boolean isPresent = file.exists() && file.isFile();
        System.out.println("File exists: " + isPresent);
        System.out.println("File path: " + filePath);

        return isPresent;
    }

    public static ArrayList<String> readDataFromFile(String filePath) {
        ArrayList<String> text = new ArrayList<>();
        if (fileExists(filePath)) {
            try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
                String line;
                while ((line = br.readLine()) != null) {
                    text.add(line);
                }
                System.out.println("File read successfully.\n");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist.");
        }

        return text;
    }

    public static void readTextFromArrayList(ArrayList<String> text, int numLines) {
        for (int i = 0; i < numLines; i++) {
            System.out.println(text.get(i));
        }
    }
}
