import java.util.Random;

public class Main_DZ2
{
    public static void main(String[] args)
    {
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
            System.out.println("\nСумма всех элементов массива: "+z.Task2_Sum(tmpArray));
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 4.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            System.out.println("\nСреднее значение элементов массива: "+z.Task4_CalculateAvg(tmpArray));
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 5.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            String message1 = z.Task5_Contains(tmpArray, tmpArray[6])?" содержит":" не содержит";
            String message2 = z.Task5_Contains(tmpArray, 35)?" содержит":" не содержит";
            System.out.println("\nМассив"+message1+" число "+tmpArray[6] +" и " + message2 + " число 35.");
            System.out.println("\n__________");
        }

        {
            System.out.println("Задание 6.");
            int[] tmpArray = z.CreateRandomIntArray(16);
            System.out.println("Исходный массив: ");
            z.PrintArray(tmpArray);
            int index = z.Task6_FirstIndexOf(tmpArray, tmpArray[6]);
            System.out.println("\nИндекс элемента "+tmpArray[6]+" - "+index +" .");
            System.out.println("\n__________");
        }

        //System.out.println("Задание 2.\nРезультаты суммирования элементов массива: "+sum+"\n_____");
    }




}
