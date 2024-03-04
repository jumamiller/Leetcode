import org.example.TwoSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {
    TwoSum twoSum;

    @BeforeEach
    public void setUp() {
        twoSum = new TwoSum();
    }
    @Test
    @DisplayName("Two Sum")
    public void testTwoSum() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expected={1,2};

        int[] results= twoSum.twoSum(nums,target);

        assert Arrays.equals(results, expected);
    }
}
