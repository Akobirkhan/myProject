import java.util.Random;

public class RandomUtil {
    public static Random random = new Random();
    public static int getRandom(int n){// [0, 1]
        return random.nextInt(n); // [0, 1, 2, 3, ... , n-1]
    }

    public static int getRandom(int a, int b){// [a,   b]
        return random.nextInt(a, b);
    }
}
