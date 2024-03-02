import org.example.LongestPalindromicSubstring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeEach
    public void setUp() {
        longestPalindromicSubstring= new LongestPalindromicSubstring();
    }
    @Test
    @DisplayName("Longest palindromic substring")
    public void testCalculateLongestPalindromicSubstring() {
        String input="babad";
        String expected="bab";

        String result= longestPalindromicSubstring.findLongestPalindromicSubstr(input);

        assert (Objects.equals(result, expected));
    }
}
