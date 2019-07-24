package DZ1;

public class Main_DZ1 {

    public static void main(String[] args) {
        System.out.println("Задание 1.");
        {
            double ves1 = 109, ves2 = 45.6;
            System.out.println("Человек с массой " + ves1 + ", будет весить на луне " + Zadanija.Zadanije1_VesNaLune(ves1) + ".");
            System.out.println("Человек с массой " + ves2 + ", будет весить на луне " + Zadanija.Zadanije1_VesNaLune(ves2) + ".");
        }
        System.out.println("__________");

        System.out.println("Задание 2.");
        {
            int[] anArray = {10, 69, 15, 45, 68, 132, 654654, 21, 46, 21, 86, 21, 546, 21, 5};
            System.out.println("Исходный массив: ");
            for (int i : anArray) {
                System.out.print(i + "\t");
            }
            Zadanija.Zadanije2_Array(anArray);
            System.out.println("\nПреобразованный массив: ");
            for (int i : anArray) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n__________");

        System.out.println("Задание 3.");
        {
            int[] paly = {123, 123321, 1236, 96869, 32140};
            for (int i : paly) {
                if (Zadanija.Zadanije3_Palindrom(i)) {
                    System.out.println("Число " + i + " являетя палиндромом.");
                } else {
                    System.out.println("Число " + i + " не являетя палиндромом.");
                }
            }
        }
        System.out.println("\n__________");

        System.out.println("Задание 4.");
        {
            System.out.println("Все четные числa от 1 до 100.");
            Zadanija.Zadanije4_Even100();
        }
        System.out.println("\n__________");

        System.out.println("Задание 5.");
        {
            System.out.println("Все нечетные числа от 1 до 15.");
            Zadanija.Zadanije5_Odd15();
        }
        System.out.println("\n__________");

        System.out.println("Задание 6.");
        {
            System.out.println("Все четные числa от 1 до 100.");
            Zadanija.Zadanije6_EvenFor();
        }
        System.out.println("\n__________");

        System.out.println("Задание 7.");
        {
            Zadanija.Zadanije7_SumFor();
        }
        System.out.println("\n__________");

        System.out.println("Задание 8.");
        {
            Zadanija.Zadanije8_Year();
        }
        System.out.println("\n__________");

        System.out.println("Задание 9.");
        {
            Zadanija.Zadanije9_Rearrangement();
        }
        System.out.println("__________");

        System.out.println("Задание 10.");
        {
            int i1 = 65, i2 = 56;
            Zadanija.Zadanije10_SumTiPrint(i1, i2);
        }
        System.out.println("__________");

        System.out.println("Задание 11.");
        {
            int z1 = 16, z2 = 65, z3 = 4;
            System.out.println("Наибольшим числом из " + z1 + ", " + z2 + ", " + z3 + " является " + Zadanija.Zadanije11_Max(z1, z2, z3) + ".");
        }
        System.out.println("__________");

        System.out.println("Задание 12.");
        {
            Zadanija.Zadanije12_BoolToString();
        }
        System.out.println("__________");

        System.out.println("Задание 13.");
        {
            Zadanija.Zadanije13_Concat();
        }
        System.out.println("__________");

        System.out.println("Задание 14.");
        {
            Zadanija.Zadanije14_Calculate();
        }
        System.out.println("__________");

        System.out.println("Задание 15.");
        {
            Zadanija.Zadanije15_Loops();
        }
        System.out.println("\n__________");

        System.out.println("Задание 16.");
        {
            System.out.println("Выполнение задания для чисел 3 и 289 с шагом 7.");
            Zadanija.Zadanije16_Print(3, 289, 7);
            System.out.println("\nВыполнение задания для чисел -54 и 67 с шагом 4.");
            Zadanija.Zadanije16_Print(-54, 67, 4);
        }
        System.out.println("\n__________");

        System.out.println("Задание 17.");
        {
            double[] anArray = {10, 69, 15, 45, 68, 132, 65, 21, 46, 21, 86, 21, 46, 21, 5};
            System.out.println("Исходный массив: ");
            for (double i : anArray) {
                System.out.print(i + "\t");
            }
            Zadanija.Zadanije17_Array(anArray);
            System.out.println("\nПреобразованный массив: ");
            for (double i : anArray) {
                System.out.print(i + "\t");
            }

        }
        System.out.println("\n__________");

        System.out.println("Задание 18.");
        {
            double value = 16.5D;
            double course = 0.49D;
            double result = (Zadanija.Zadanije18_Currencu(value, course));
            System.out.println("При курсе " + course + " за " + value + " рубля можно приобрести "
                    + String.valueOf(result).substring(0, 4) + " доллара.");
        }
        System.out.println("\n__________");

        System.out.println("Задание Advanced.");
        {
            Zadanija.Advanced_Calculate(45);
            Zadanija.Advanced_Calculate(954);
        }
        System.out.println("__________");
    }
}


