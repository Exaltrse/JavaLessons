package DZ8_StreamsAndPatterns;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class Supply {

    //I did not handle exceptions regarding reading the file because laziness and once.
    public static int writeStringData(List<String> stringList, Path paths) {
        try {
            Files.write(paths, stringList);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    public static List<String> readStringData(Path paths) {
        try {
            return Files.readAllLines(paths);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static List<Integer> generateRandomIntArray(int capacity) {
        if (capacity <= 0) return null;
        List<Integer> intList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < capacity; i++) {
            intList.add(r.nextInt());
        }
        return intList;
    }

    public static void writeIntList(List<Integer> intList, Path paths) {
        List<String> stringList = new ArrayList<>();
        for (Integer i : intList) {
            stringList.add(i.toString());
        }
        writeStringData(stringList, paths);
    }

    public static List<Integer> readIntList(Path path) {
        List<String> stringList = readStringData(path);
        List<Integer> intList = parseStringListToIntList(stringList);
        return intList;
    }

    public static String replaseSubstrings(String string) {
        String[] stringArray = string.split(" ");
        if (stringArray.length < 2) return string;
        String tmpString = stringArray[0];
        stringArray[0] = stringArray[stringArray.length - 1];
        stringArray[stringArray.length - 1] = tmpString;
        string = "";
        for (String s : stringArray) {
            string += s + " ";
        }
        string = string.substring(0, string.length() - 2);
        return string;
    }


    private static List<String> intArrayToStringList(int[] intArray) {
        if (intArray == null) return null;
        if (intArray.length < 1) return null;
        List<String> stringList = new ArrayList<>(Arrays.asList(Arrays.toString(intArray).split(", ")));
        if (stringList.get(0).charAt(0) == '[') {
            stringList.set(0, stringList.get(0).substring(1));
        }
        if (stringList.get(stringList.size() - 1).endsWith("]")) {
            stringList.set(
                    stringList.size() - 1,
                    stringList.get(stringList.size() - 1).substring(
                            0,
                            stringList.get(stringList.size() - 1).length() - 2));
        }
        return stringList;
    }

    private static List<Integer> parseStringListToIntList(List<String> stringList) {
        if (stringList == null) return null;
        if (stringList.size() == 0) return null;
        List<Integer> intList = new ArrayList<>();
        for (String s : stringList) {
            intList.add(Integer.parseInt(s));
        }
        return intList;
    }

    private static int[] sortIntArray(int[] intArray) {
        if (intArray == null) return null;
        if (intArray.length <= 1) return intArray;
        int difference = intArray.length;
        boolean swapped = true;
        while (difference > 1 || swapped) {
            if (difference > 1)
                difference = (int) (difference / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + difference < intArray.length) {
                if (intArray[i] > (intArray[i + difference])) {
                    int tmpInt = intArray[i];
                    intArray[i] = intArray[i + difference];
                    intArray[i + difference] = tmpInt;
                    swapped = true;
                }
                i++;
            }
        }
        return intArray;
    }


}
