public class Zadanija {

    //1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
    // что сила тяжести равна 16% от силы тяжести на Земле.
    public double Zadanije1_VesNaLune(double ves)
    {
        return (ves*0.16);
    }

    //2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.
    /*В задании не указано, но исходим из того, что массив целочисленных чисел*/
    public void Zadanije2_Array(int[] anArray)
    {
        for(int i=0; i<anArray.length; i++)
        {
            anArray[i]=(int)(anArray[i]*1.1);
        }
    }

    //3. Напишите метод, который будет проверять является ли число палиндромом
    // (одинаково читающееся в обоих направлениях).
    /*В задании не указано, но исходим из того, что мы работаем с целочисленными значениями.
    * В иных случаях необходимо разрешить вопрос как воспринимать
    * разделитель целой и дробной части - считать его центром симметрии или опускать его обработку.*/
    public boolean Zadanije3_Palindrom(int number)
    {
        String s = Integer.toString(number);
        int l = s.length()-1;
        for(int i=0; i<l;i++)
        {
            if(s.charAt(i)!=s.charAt(l-i)) return false;
        }
        return true;
    }

//4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)
    public void Zadanije4_Even100()
    {
        for(int i=1; i<=100; i++)
        {
            if(i%2==0) System.out.print(i+"\t");
        }
    }

    //5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)
    public void Zadanije5_Odd15()
    {
        for(int i=1; i<=15; i++)
        {
            if(i%2!=0) System.out.print(i+"\t");
        }
    }

    //6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления
    // (используя только цикл for)
    public void Zadanije6_EvenFor()
    {
        for(int i=2; i<=100; i+=2)
        {
            System.out.print(i+"\t");
        }
    }

    //7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)
    public void Zadanije7_SumFor()
    {
        int sum = 0;
        for(int i=20;i<=200;i++)
        {
            sum+=i;
        }
        System.out.println("Сумма чисел от 20 до 200 равняется "+sum+".");
    }

    //8. Пройти циклом по числам от 1 до 12 и вывести название месяца,
    // соответствующее каждому числу (используя цикл и оператор if else)
    public void Zadanije8_Year()
    {
        System.out.println("Месяца года:");
        for(int i=1; i<=12;i++)
        {
            if(i==1) System.out.println(i+" - Январь.");
            if(i==2) System.out.println(i+" - Февраль.");
            if(i==3) System.out.println(i+" - Март.");
            if(i==4) System.out.println(i+" - Апрель.");
            if(i==5) System.out.println(i+" - Май.");
            if(i==6) System.out.println(i+" - Июнь.");
            if(i==7) System.out.println(i+" - Июль.");
            if(i==8) System.out.println(i+" - Август.");
            if(i==9) System.out.println(i+" - Сентябрь.");
            if(i==10) System.out.println(i+" - Октябрь.");
            if(i==11) System.out.println(i+" - Ноябрь.");
            if(i==12) System.out.println(i+" - Декабрь.");
        }
    }

    //9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
    // чтобы значение первой оказалось во второй, а второй - в первой.
    public void Zadanije9_Rearrangement()
    {
        int i1=5, i2=9,tmp=0;
        System.out.println("Объявлены переменные "+i1+" и "+i2+".");
        tmp=i1;
        i1=i2;
        i2=tmp;
        System.out.println("Результат преобразований переменных: "+i1+" и "+i2+".");

    }

    //10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения,
    // а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.
    public void Zadanije10_SumTiPrint(int int1, int int2)
    {
        int int3=int1+int2;
        System.out.println("Сумма чисел "+int1+" и "+int2+" равняется "+int3+".");
    }

    //11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
    public int Zadanije11_Max(int int1, int int2, int int3)
    {
        if(int1>=int2)
        {
            if(int3>int1) {return int3;}
            else {return int1;}
        }
        if(int2>=int3){return int2;}
        return int3;
    }

    //12. Напишите программу, в которой используются две переменные логического типа (boolean),
    // присвойте им значения и выведете для каждой переменной на экран строку "истина",
    // если переменная имеет значение true и "ложь", если переменная имеет значение false.
    public void Zadanije12_BoolToString()
    {
        boolean bool1=true;
        boolean bool2=false;
        System.out.println(Z12_Support(bool1));
        System.out.println(Z12_Support(bool2));
    }

    public String Z12_Support(boolean bool)
    {
        if(bool){return "истина";}
        return "ложь";
    }

    //13. Напишите программу, где двум строковым переменным присваиваются значения,
    // третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
    // Затем напечатайте значение третьей строковой переменной.
    public void Zadanije13_Concat()
    {
        String s1 ="Lorem ipsum ";
        String s2 ="dolor sit amet";
        String s3 =s1+s2;
        System.out.println("Результат конкатенации строк:\n"+s3);
    }

    //14. Создайте программу с двумя переменными целого типа, присвойте им значения,
    // если первая переменная больше второй, то увеличьте её значение на 3,
    // иначе увеличьте значение второй переменной на 8.
    // В конце программы выведите значения обоих чисел на экран.
    public void Zadanije14_Calculate()
    {
        int int1 = 65;
        int int2 = 128;
        System.out.println("Первоначлаьное значение переменных. Переменная 1 - "+int1+". Переменная 2 - "+int2+".");
        if(int1>int2) {int1+=3;}
        else{int2+=8;}
        System.out.println("Значение переменных после преобразований. Переменная 1 - "+int1+". Переменная 2 - "+int2+".");
    }

    //15. Выведете на экран все числа от 1 до 100 с помощью цикла
    // (можно все три варианта в одной программе):
    //for
    //while
    //do while
    public void Zadanije15_Loops()
    {
        int i=1;
        System.out.println("While: ");
        while(i<=100)
        {
            System.out.print(i+"\t");
            i++;
        }
        i=1;
        System.out.println("\nDo-While: ");
        do
        {
            System.out.print(i+"\t");
            i++;
        }while(i<=100);
        System.out.println("\nFor: ");
        for(i=1;i<=100;i++)
        {
            System.out.print(i+"\t");
        }
    }

    //16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
    // Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
    // Минимум, максимум и шаг указываются пользователем (можно захардкодить).
    public void Zadanije16_Print(int startNumber, int finishNumber, int shag)
    {
        for(; startNumber<=finishNumber; startNumber+=shag)
        {
            System.out.print(startNumber+"\t");
        }
        System.out.print(finishNumber);
    }

    //17. Все элементы массива поделить на значение наибольшего элемента этого массива.
    public void Zadanije17_Array(double[] anArray)
    {
        double tmp = Double.MIN_VALUE;
        for(int i=0; i<anArray.length;i++)
        {
            if(anArray[i]>tmp){tmp=anArray[i];}
        }
        if(tmp==0)
        {
            System.out.println("Максимальное значение в массиве оказалось 0. Деление на 0 невозможно. Оконание выполнения метода.");
            return;
        }
        for(int i=0; i<anArray.length; i++)
        {
            anArray[i]=(int)anArray[i]/tmp;
        }
    }

    //18. Напишите метод переводящий рубли в доллары по заданному курсу.
    // В качестве аргументов укажите кол-во рублей и курс.
    public double Zadanije18_Currencu(double rubli, double course)
    {
        return rubli*course;
    }


    //Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.
    public void Advanced_Calculate(int sutok)
    {
        long hours = sutok*24;
        long min = hours*60;
        long sec = min*60;
        System.out.println("В "+sutok+" насчитывается:");
        System.out.println("часов "+hours+";");
        System.out.println("минут "+min+";");
        System.out.println("секунд "+sec+".");
    }


}
