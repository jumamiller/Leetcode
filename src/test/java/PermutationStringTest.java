import org.example.PermutationString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Set;

public class PermutationStringTest {
    PermutationString permutationString;
    @BeforeEach
    public void setUp() {
        permutationString = new PermutationString();
    }
    @Test
    @DisplayName("Permutation in String")
    public void testCheckInclusion() {
        String s1Input="ab";
        String s2Input="eidbaooo";
        boolean expected=true;

        boolean result= permutationString.checkInclusion(s1Input,s2Input);

        assert result == expected;
    }
    @Test
    @DisplayName("Get permutations")
    public void testGetPermutations() {
        String input="ABC";
        //[ACB, BCA, ABC, CBA, BAC, CAB]
        Set<String> expected=Set.of("ACB", "BCA", "ABC", "CBA", "BAC", "CAB");

        Set<String> result= PermutationString.getPermutation(input);
        assert Objects.equals(result, expected);
    }
}
