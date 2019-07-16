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
            //Neshta ne to.
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
