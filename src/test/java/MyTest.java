import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, Kata.digitize(35231));
    }

    private static class Kata {
        public static int[] digitize(long n) {

        int[] result = new int[("" + n).length()];
        for (int i = 0; n > 0; i++) {
            result[i] = (int)(n % 10);
            n /= 10;
        }
        return result;
    }
}
    }

