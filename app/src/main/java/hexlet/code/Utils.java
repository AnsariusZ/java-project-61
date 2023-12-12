package hexlet.code;

import java.util.Random;
public class Utils {
    public static int getRandomNumbers(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}
