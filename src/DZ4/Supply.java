package DZ4;

import java.util.Random;

public final class Supply {
    public final static String NO_NAME = "NoName";
    public final static int BASE_PRICE_VALUE = 0;
    public final static int BASE_NUMBER_VALUE = 0;

    public static String RandomString(int dlinna) {
        String resultString = "";
        Random r = new Random();
        for (int i = 0; i <= dlinna; i++) {
            resultString += (char) (r.nextInt(26) + 'a');
        }
        return resultString;
    }

    public static int RandomInt(int predel) {
        Random r = new Random();
        return r.nextInt(predel);
    }
}
