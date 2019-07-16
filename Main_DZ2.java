import java.util.ArrayList;
import java.util.Random;

public class Main_DZ2 {
    public static void main(String[] args) {
        Zadanija z = new Zadanija();

        {
            System.out.println("Задание 1.\n");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Числовой массив.\nИсходный массив: ");
            z.PrintArray(tmpArray);
            tmpArray = z.Task1_Sort(tmpArray);
            System.out.println("\nМассив после преобразований: ");
            z.PrintArray(tmpArray);
            System.out.println("\n__________");
            System.out.println("\nСтроковый массивы\nИсходный массив:");
            String[] s = z.CreateStringArray();
            z.PrintSArray(s);
            System.out.println("\nМассив после преобразований: ");
            s = z.Task1_Sort(s);
            z.PrintSArray(s);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 2.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            System.out.println("\nСумма всех элементов массива: " + z.Task2_Sum(tmpArray));
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 4.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            System.out.println("\nСреднее значение элементов массива: " + z.Task4_CalculateAvg(tmpArray));
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 5.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            String message1 = z.Task5_Contains(tmpArray, tmpArray[6]) ? " содержит" : " не содержит";
            String message2 = z.Task5_Contains(tmpArray, 35) ? " содержит" : " не содержит";
            System.out.println("\nМассив" + message1 + " число " + tmpArray[6] + " и " + message2 + " число 35.");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 6.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            int index = z.Task6_FirstIndexOf(tmpArray, tmpArray[6]);
            System.out.println("\nИндекс элемента " + tmpArray[6] + " - " + index + " .");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 7.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            int index = 6;
            tmpArray = z.Task7_Remove(tmpArray, index);
            System.out.println("\nМассив после преобразований (удален индекс " + index + "): ");
            z.PrintArray(tmpArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 8.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            int[] resultArray = z.Task8_ArrayIteratingCopy(tmpArray);
            System.out.println("\nМассив 2: ");
            z.PrintArray(resultArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 9.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            int index = 6, value = 152;
            tmpArray = z.Task9_InsertValueToIndex(tmpArray, index, value);
            System.out.println("\nМассив после преобразований (в индекс " + index + " добавлено значение " + value + "): ");
            z.PrintArray(tmpArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 10.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            System.out.println("");
            z.Task10_MaxAndMinValue(tmpArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 11.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            tmpArray =z.Task11_Reverse(tmpArray);
            System.out.println("\nМассив после преобразований: ");
            z.PrintArray(tmpArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 12.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            Random r = new Random();
            for(int i=0; i<10; i++)
            {
                tmpArray = z.Task9_InsertValueToIndex(tmpArray, tmpArray.length, tmpArray[r.nextInt(15)]);
            }
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            int[] result = z.Task12_FindDuplicates(tmpArray);
            if(result.length<1)
            {
                System.out.println("В массиве не найдено дубликатов.");
            }
            else
            {
                System.out.println("\nНайденные в массиве дубликаты: ");
                z.PrintArray(result);
            }
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 13.");
            String[] tmpArray = z.CreateStringArray();
            Random r = new Random();
            for(int i=0; i<6;i++)
            {
                tmpArray = z.AddIndexToArray(tmpArray, tmpArray.length, tmpArray[r.nextInt(6)]);
            }
            System.out.println("Исходный массив: ");
            z.PrintSArray(tmpArray);
            String[] results = z.Task13_DuplicatesStrings(tmpArray);
            System.out.println("\nНайденные дубликаты строк: ");
            z.PrintSArray(results);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 14");
            String[] stringArray1 = z.CreateStringArray();
            String[] stringArray2 = {
                                        "Lorem ipsum dolor ",
                                        "sit amet, ",
                                        "И воздел он свое ",
                                        "пылающее сердце,",
                                        "и оно горело так ярко ",
                                        "как солнце ",
                                        "и даже ярче солнца",
                                        "Excepteur sint occaecat cupidatat "};
            String[] result = z.Task14_Compare(stringArray1, stringArray2);
            z.PrintSArray(result);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 15");
            int[] intArray = z.CreateRandomIntArray(16);
            System.out.println("Массив 1.");
            z.PrintArray(intArray);
            int[] intArray2 = z.CreateRandomIntArray(16);
            System.out.println("\nМассив 2.");
            z.PrintArray(intArray2);
            int[] results = z.Task15_Common(intArray,intArray2);
            System.out.println("\nОбщие элементы в массивах: ");
            z.PrintArray(results);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 16");
            int[] intArray = z.CreateRandomIntArray(14);
            int int1 = intArray[3], int2 = intArray[4];
            intArray = z.Task9_InsertValueToIndex(intArray, 4, int1);
            intArray = z.Task9_InsertValueToIndex(intArray, 5, int2);
            System.out.println("Исходный массив.");
            z.PrintArray(intArray);
            System.out.println("\nМассив после удаления дублирующихся значений.");
            int[] result = z.Task16_RemoveDuplicates(intArray);
            z.PrintArray(result);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 17");
            int[] intArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив.");
            z.PrintArray(intArray);
            int result = z.Task17_SecondLargest(intArray);
            System.out.println("\nВторое по величине значение начиная с максимального - "+result+".");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 18");
            int[] intArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив.");
            z.PrintArray(intArray);
            int result = z.Task18_SecondSmallest(intArray);
            System.out.println("\nВторое по величине значение начиная с минимального - "+result+".");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 19");
            int[] intArray = z.CreateRandomIntArray(16);
            z.Task19_Add2Matrices();
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 20");
            int[] intArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив.");
            z.PrintArray(intArray);
            ArrayList<Integer> intAL = z.Task20(intArray);
            System.out.println("\nArrayList.");
            System.out.println(intAL.toString());
            System.out.println("\n__________");
        }



    }


}

class Zadanija {
    //Task 1. Write a Java program to sort a numeric array and a string array.
    public int[] Task1_Sort(int[] intArray) {
        if (intArray.length <= 1) return null;
        int[] tmpArray = Task8_ArrayIteratingCopy(intArray);
        boolean switcher = false;
        do {
            switcher = false;
            for (int i = 0, k = 1; k < tmpArray.length; i++, k++) {
                if (tmpArray[i] > tmpArray[k]) {
                    int tmp = tmpArray[k];
                    tmpArray[k] = tmpArray[i];
                    tmpArray[i] = tmp;
                    switcher = true;
                }
            }
        } while (switcher);
        return tmpArray;
    }

    public String[] Task1_Sort(String[] strArray) {
        if (strArray.length <= 1) return null;
        String[] tmpArray = IteratingCopfy(strArray);
        boolean switcher = false;
        do {
            switcher = false;
            for (int i = 0, k = 1; k < tmpArray.length; i++, k++) {
                if (SmallerString(tmpArray[i], tmpArray[k])) {
                    String tmp = tmpArray[k];
                    tmpArray[k] = tmpArray[i];
                    tmpArray[i] = tmp;
                    switcher = true;
                }
            }

        } while (switcher);
        return tmpArray;
    }

    private String[] IteratingCopfy(String[] stringArray) {
        String[] tmpArray = new String[stringArray.length];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = stringArray[i];
        }
        return tmpArray;
    }

    private boolean SmallerString(String string1, String string2) {
        //Если строка string1 меньше string2 - истина,
        //если строка string1 больше string2 - ложь.
        for (int i = 0, k = 0; (i < string1.length()) && (k < string2.length()); i++, k++) {
            if (string1.charAt(i) < string2.charAt(k)) return true;
            else {
                if (string1.charAt(i) > string2.charAt(k)) return false;
                else continue;
            }
        }
        return false;
    }

    //Task 2. Write a Java program to sum values of an array.
    public long Task2_Sum(int[] intArray) {
        long sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        return sum;
    }

    //Task 3. Write a Java program to print the following grid
    //Task 4.  Write a Java program to calculate the average value of array elements.
    public int Task4_CalculateAvg(int[] intArray) {
        return (int) (Task2_Sum(intArray) / intArray.length);
    }

    //Task 5.  Write a Java program to test if an array contains a specific value.
    public boolean Task5_Contains(int[] intArray, int sample) {
        for (int i : intArray) {
            if (i == sample) return true;
        }
        return false;
    }

    //Task 6.  Write a Java program to find the index of an array element.
    public int Task6_FirstIndexOf(int[] intArray, int sample) {
        if (Task5_Contains(intArray, sample)) {
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] == sample) return i;
            }
        }
        return -1;
    }

    //Task 7.  Write a Java program to remove a specific element from an array.
    public int[] Task7_Remove(int[] intArray, int indexToRemove) {
        if (intArray.length <= indexToRemove) return null;
        int[] tmpArray = new int[intArray.length - 1];
        for (int i = 0, k = 0; (k < tmpArray.length) && (i < intArray.length); i++) {
            if (i == indexToRemove) continue;
            tmpArray[k] = intArray[i];
            k++;
        }
        return tmpArray;
    }

    //Task 8.  Write a Java program to copy an array by iterating the array.
    public int[] Task8_ArrayIteratingCopy(int[] intArray) {
        int[] tmpArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            tmpArray[i] = intArray[i];
        }
        return tmpArray;
    }

    //Task 9.  Write a Java program to insert an element (specific position) into an array.
    public int[] Task9_InsertValueToIndex(int[] intArray, int indexForInsert, int valueToInsert) {
        if (intArray.length < indexForInsert) return null;
        int[] tmpArray = new int[intArray.length + 1];
        for (int i = 0, k = 0; k < tmpArray.length; i++,k++) {
            if (i == indexForInsert) {
                tmpArray[k] = valueToInsert;
                k++;
                if(k>=tmpArray.length) continue;
            }

            tmpArray[k] = intArray[i];
            //k++;
        }
        return tmpArray;
    }

    //Task 10. Write a Java program to find the maximum and minimum value of an array.
    public void Task10_MaxAndMinValue(int[] intArray) {
        System.out.println("Максимальное значение в массиве -  " + MaxValue(intArray) + ", минимальное - " + MinValue(intArray) + ".");
    }

    private int MaxValue(int[] intArray) {
        int max = Integer.MIN_VALUE;
        for (int i : intArray) {
            if (max < i) max = i;
        }
        return max;
    }

    private int MinValue(int[] intArray) {
        int min = Integer.MAX_VALUE;
        for (int i : intArray) {
            if (min > i) min = i;
        }
        return min;
    }

    //Task 11. Write a Java program to reverse an array of integer values.
    public int[] Task11_Reverse(int[] intArray) {
        int[] tmpArray = new int[intArray.length];
        for (int i = 0, k = intArray.length - 1; i < intArray.length; i++, k--)
        {
            tmpArray[i] = intArray[k];
        }
        return tmpArray;
    }

    //Task 12. Write a Java program to find the duplicate values of an array of integer values.
    public int[] Task12_FindDuplicates(int[] intArray) {
        int[] resultArray = new int[0];
        int[] tmpArray = Task8_ArrayIteratingCopy(intArray);
        for (int i = 0; i < tmpArray.length; i++) {
            if (Task5_Contains(resultArray, tmpArray[i])) continue;
            int[] temporayArray = Task8_ArrayIteratingCopy(tmpArray);
            temporayArray = Task7_Remove(temporayArray, i);
            if (Task5_Contains(temporayArray, tmpArray[i]))
                resultArray = Task9_InsertValueToIndex(resultArray, resultArray.length, tmpArray[i]);

        }
        return resultArray;
    }

    //Task 13. Write a Java program to find the duplicate values of an array of string values.
    public String[] Task13_DuplicatesStrings(String[] stringArray) {
        if (stringArray.length <= 1) return null;
        String[] results = new String[0];
        String[] tmpStringArray = IteratingCopfy(stringArray);
        for (int i = 0; i < (stringArray.length - 1); i++) {
            if (ContainString(results, tmpStringArray[i])) continue;
            String[] tmpArray = IteratingCopfy(stringArray);
            tmpArray = RemoveIndexFromArray(tmpArray, i);
            if (ContainString(tmpArray, tmpStringArray[i])) {
                results = AddIndexToArray(results, results.length, tmpStringArray[i]);
            }
        }
        return results;
    }

    private boolean ContainString(String[] sArray, String string) {
        for (String s : sArray) {
            if (s.equals(string)) return true;
        }
        return false;
    }

    public String[] RemoveIndexFromArray(String[] arr, int index) {
        if (index>=arr.length) return null;
        String[] tmpArray = new String[arr.length - 1];
        for (int i = 0, k = 0; i < tmpArray.length; i++, k++) {
            if (i == index) {
                k++;
            }
            tmpArray[i] = arr[k];
        }
        return tmpArray;
    }

    public String[] AddIndexToArray(String[] arr, int index, String value) {
        if (index>arr.length) return null;
        String[] tmpArray = new String[arr.length + 1];
        for (int i = 0, k = 0; i < tmpArray.length; i++, k++) {
            if (i == index) {
                tmpArray[i] = value;
                i++;
                if(i>=tmpArray.length) continue;
            }
            tmpArray[i] = arr[k];
        }
        return tmpArray;
    }

    //Task 14. Write a Java program to find the common elements between two arrays (string values).
    public String[] Task14_Compare(String[] stringArray1, String[] stringArray2) {
        String[] results = new String[0];
        for (String s : stringArray1) {
            if (ContainString(stringArray2, s)) {
                if(ContainString(results,s)) continue;
                results = AddIndexToArray(results, results.length, s);
            }
        }
        return results;
    }

    //Task 15. Write a Java program to find the common elements between two arrays of integers.
    public int[] Task15_Common(int[] intArray1, int[] intArray2) {
        int[] resultsArray = new int[0];
        for (int i : intArray1) {
            if (Task5_Contains(resultsArray, i)) continue;
            if (Task5_Contains(intArray2, i))
                resultsArray = Task9_InsertValueToIndex(resultsArray, resultsArray.length, i);
        }
        return resultsArray;
    }

    //Task 16. Write a Java program to remove duplicate elements from an array.
    public int[] Task16_RemoveDuplicates(int[] intArray) {
        int[] duplicates = Task12_FindDuplicates(intArray);
        if (duplicates.length == 0) return null;
        int[] tmpArray = Task8_ArrayIteratingCopy(intArray);
        for (int i : duplicates) {
            while (Task5_Contains(tmpArray, i)) {
                int t = Task6_FirstIndexOf(tmpArray, i);
                if (t < 0) continue;
                tmpArray = Task7_Remove(tmpArray, t);
            }
        }
        return tmpArray;
    }

    //Task 17. Write a Java program to find the second largest element in an array.
    public int Task17_SecondLargest(int[] intArray) {
        int[] tmpArray = Task8_ArrayIteratingCopy(intArray);
        int max = MaxValue(intArray);
        while (Task5_Contains(tmpArray, max)) {
            tmpArray = Task7_Remove(tmpArray, Task6_FirstIndexOf(tmpArray, max));
        }
        return MaxValue(tmpArray);
    }

    //Task 18. Write a Java program to find the second smallest element in an array.
    public int Task18_SecondSmallest(int[] intArray) {
        int[] tmpArray = Task8_ArrayIteratingCopy(intArray);
        int min = MinValue(intArray);
        while (Task5_Contains(tmpArray, min)) {
            tmpArray = Task7_Remove(tmpArray, Task6_FirstIndexOf(tmpArray, min));
        }
        return MinValue(tmpArray);
    }

    //Task 19. Write a Java program to add two matrices of the same size.
    public void Task19_Add2Matrices() {
        int a = 15;
        int[] array1 = new int[a];
        int[] array2 = new int[a];
        Random r = new Random();
        for (int i = 0; i < a; i++) {
            array1[i] = r.nextInt(400);
            array2[i] = r.nextInt(50);
        }
        System.out.println("\nМассив 1. ");
        PrintArray(array1);
        System.out.println("\nМассив 2. ");
        PrintArray(array2);
    }

    //Task 20. Write a Java program to convert an array to ArrayList.
    public ArrayList<Integer> Task20(int[] intArray) {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i : intArray) {
            intArrayList.add(i);
        }
        return intArrayList;
    }


    //Методы поддержки.
    public void PrintArray(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + "\t");
        }
    }


    public int[] CreateRandomIntArray(int numberOvElements) {
        int[] tmpArray = new int[numberOvElements];
        Random r = new Random();
        for (int i = 0; i < numberOvElements; i++) {
            tmpArray[i] = r.nextInt(200);
        }
        return tmpArray;
    }

    public String[] CreateStringArray() {
        String[] tmp = {"Lorem ipsum dolor ",
                        "sit amet, ",
                        "consectetur adipiscing elit, ",
                        "sed do eiusmod tempor incididunt ",
                        "ut labore et dolore magna aliqua. ",
                        "Ut enim ad minim veniam, ",
                        "quis nostrud exercitation ",
                        "ullamco laboris nisi ut ",
                        "aliquip ex ea commodo consequat. ",
                        "Duis aute irure dolor in reprehenderit ",
                        "in voluptate velit esse cillum ",
                        "dolore eu fugiat nulla pariatur. ",
                        "Excepteur sint occaecat cupidatat ",
                        "non proident, sunt in culpa ",
                        "qui officia deserunt mollit ",
                        "anim id est laborum.",
                        "Lorem ipsum dolor ",
                        "sit amet"
        };
        return tmp;
    }

    public void PrintSArray(String[] sArray) {
        for (String s : sArray) {
            System.out.println(s);
        }
    }
}
