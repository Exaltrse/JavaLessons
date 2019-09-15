package DZ2_Arrays;

import java.util.ArrayList;
import java.util.Random;

public class Main_DZ2 {
    public static void main(String[] args) {

        {
            System.out.println("Задание 1.\n");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Числовой массив.\nИсходный массив: ");
            Zadanija.PrintArray(tmpArray);
            tmpArray = Zadanija.Task1_Sort(tmpArray);
            System.out.println("\nМассив после преобразований: ");
            Zadanija.PrintArray(tmpArray);
            System.out.println("\n__________");
            System.out.println("\nСтроковый массивы\nИсходный массив:");
            String[] s = Zadanija.CreateStringArray();
            Zadanija.PrintSArray(s);
            System.out.println("\nМассив после преобразований: ");
            s = Zadanija.Task1_Sort(s);
            Zadanija.PrintSArray(s);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 2.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            System.out.println("\nСумма всех элементов массива: " + Zadanija.Task2_Sum(tmpArray));
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 4.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            System.out.println("\nСреднее значение элементов массива: " + Zadanija.Task4_CalculateAvg(tmpArray));
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 5.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            String message1 = Zadanija.Task5_Contains(tmpArray, tmpArray[6]) ? " содержит" : " не содержит";
            String message2 = Zadanija.Task5_Contains(tmpArray, 35) ? " содержит" : " не содержит";
            System.out.println("\nМассив" + message1 + " число " + tmpArray[6] + " и " + message2 + " число 35.");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 6.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            int index = Zadanija.Task6_FirstIndexOf(tmpArray, tmpArray[6]);
            System.out.println("\nИндекс элемента " + tmpArray[6] + " - " + index + " .");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 7.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            int index = 6;
            tmpArray = Zadanija.Task7_Remove(tmpArray, index);
            System.out.println("\nМассив после преобразований (удален индекс " + index + "): ");
            Zadanija.PrintArray(tmpArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 8.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            int[] resultArray = Zadanija.Task8_ArrayIteratingCopy(tmpArray);
            System.out.println("\nМассив 2: ");
            Zadanija.PrintArray(resultArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 9.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            int index = 6, value = 152;
            tmpArray = Zadanija.Task9_InsertValueToIndex(tmpArray, index, value);
            System.out.println("\nМассив после преобразований (в индекс " + index + " добавлено значение " + value + "): ");
            Zadanija.PrintArray(tmpArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 10.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            System.out.println("");
            Zadanija.Task10_MaxAndMinValue(tmpArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 11.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            tmpArray = Zadanija.Task11_Reverse(tmpArray);
            System.out.println("\nМассив после преобразований: ");
            Zadanija.PrintArray(tmpArray);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 12.");
            int[] tmpArray = Zadanija.CreateRandomIntArray(16);
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                tmpArray = Zadanija.Task9_InsertValueToIndex(tmpArray, tmpArray.length, tmpArray[r.nextInt(15)]);
            }
            System.out.println("Исходный массив: ");
            Zadanija.PrintArray(tmpArray);
            int[] result = Zadanija.Task12_FindDuplicates(tmpArray);
            if (result.length < 1) {
                System.out.println("В массиве не найдено дубликатов.");
            } else {
                System.out.println("\nНайденные в массиве дубликаты: ");
                Zadanija.PrintArray(result);
            }
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 13.");
            String[] tmpArray = Zadanija.CreateStringArray();
            Random r = new Random();
            for (int i = 0; i < 6; i++) {
                tmpArray = Zadanija.AddIndexToArray(tmpArray, tmpArray.length, tmpArray[r.nextInt(6)]);
            }
            System.out.println("Исходный массив: ");
            Zadanija.PrintSArray(tmpArray);
            String[] results = Zadanija.Task13_DuplicatesStrings(tmpArray);
            System.out.println("\nНайденные дубликаты строк: ");
            Zadanija.PrintSArray(results);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 14");
            String[] stringArray1 = Zadanija.CreateStringArray();
            String[] stringArray2 = {
                    "Lorem ipsum dolor ",
                    "sit amet, ",
                    "И воздел он свое ",
                    "пылающее сердце,",
                    "и оно горело так ярко ",
                    "как солнце ",
                    "и даже ярче солнца",
                    "Excepteur sint occaecat cupidatat "};
            String[] result = Zadanija.Task14_Compare(stringArray1, stringArray2);
            Zadanija.PrintSArray(result);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 15");
            int[] intArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Массив 1.");
            Zadanija.PrintArray(intArray);
            int[] intArray2 = Zadanija.CreateRandomIntArray(16);
            System.out.println("\nМассив 2.");
            Zadanija.PrintArray(intArray2);
            int[] results = Zadanija.Task15_Common(intArray, intArray2);
            System.out.println("\nОбщие элементы в массивах: ");
            Zadanija.PrintArray(results);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 16");
            int[] intArray = Zadanija.CreateRandomIntArray(14);
            int int1 = intArray[3], int2 = intArray[4];
            intArray = Zadanija.Task9_InsertValueToIndex(intArray, 4, int1);
            intArray = Zadanija.Task9_InsertValueToIndex(intArray, 5, int2);
            System.out.println("Исходный массив.");
            Zadanija.PrintArray(intArray);
            System.out.println("\nМассив после удаления дублирующихся значений.");
            int[] result = Zadanija.Task16_RemoveDuplicates(intArray);
            Zadanija.PrintArray(result);
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 17");
            int[] intArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив.");
            Zadanija.PrintArray(intArray);
            int result = Zadanija.Task17_SecondLargest(intArray);
            System.out.println("\nВторое по величине значение начиная с максимального - " + result + ".");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 18");
            int[] intArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив.");
            Zadanija.PrintArray(intArray);
            int result = Zadanija.Task18_SecondSmallest(intArray);
            System.out.println("\nВторое по величине значение начиная с минимального - " + result + ".");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 19");
            int[] intArray = Zadanija.CreateRandomIntArray(16);
            Zadanija.Task19_Add2Matrices();
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 20");
            int[] intArray = Zadanija.CreateRandomIntArray(16);
            System.out.println("Исходный массив.");
            Zadanija.PrintArray(intArray);
            ArrayList<Integer> intAL = Zadanija.Task20(intArray);
            System.out.println("\nArrayList.");
            System.out.println(intAL.toString());
            System.out.println("\n__________");
        }

    }

}

