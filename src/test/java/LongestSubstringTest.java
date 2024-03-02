import org.example.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class LongestSubstringTest {
    LongestPalindromicSubstring longestSubstring;
    @BeforeEach
    public void setUp() {
        longestSubstring = new LongestPalindromicSubstring();
    }

    @Test
    @DisplayName("Running tests for longest palindromic substring")
    public void testLongestSubstring() {
        String input = "babad";
        String expected = "bab";
        String result = longestSubstring.findLongestPalindromicSubstring(input);
        assert(result.equals(expected));
    }
}
