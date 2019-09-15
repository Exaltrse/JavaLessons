package DZ3_Class;

import java.util.Random;

final class Support{

    public static Car randomCar() {
        String name = "";
        Random r = new Random();
        double ves = ((double) Math.round(r.nextDouble() * 300000)) / 100;
        boolean svobodna = r.nextBoolean();
        int dlinnaSlova = r.nextInt(15) + 5;
        for (int i = 0; i <= dlinnaSlova; i++) {
            name += (char) (r.nextInt(26) + 'a');
        }
        return new Car(name, svobodna, ves);
    }

    public static String[] stingForSshapka() {
        StringBuilder str = new StringBuilder(60);
        str.setLength(60);
        for (int i = 0; i < 60; i++) {
            str.insert(i, ' ');
        }
        str.insert(0, "Наименование");
        str.insert(24, "Доступность");
        str.insert(38, "Вес");
        str.insert(47, "Тип");

        String str2 = "";
        for (int i = 0; i < 60; i++) {
            str2 += "-";
        }
        String[] result = {str.toString(), str2};
        return result;
    }
}