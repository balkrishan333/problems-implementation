package hackerrank.interviewkit.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMinimumSwaps {

    @Test
    public void test_1() {
        int[] arr = {2,4,5,1,3};
        MinimumSwaps swaps = new MinimumSwaps();
        Assertions.assertEquals(3, swaps.count(arr));
    }

    @Test
    public void test_2() {
        int[] arr = {7,1,3,2,4,5,6};
        MinimumSwaps swaps = new MinimumSwaps();
        Assertions.assertEquals(5, swaps.count(arr));
    }

    @Test
    public void test_3() {
        int[] arr = {1,5, 4, 3,2};
        MinimumSwaps swaps = new MinimumSwaps();
        Assertions.assertEquals(2, swaps.count(arr));
    }
}
