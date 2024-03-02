import org.example.LongestSubWithoutRepeatingChar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestSubWithoutRepeatingCharTest {
    LongestSubWithoutRepeatingChar longestSubWithoutRepeatingChar;

    @BeforeEach
    public void setUp() {
        longestSubWithoutRepeatingChar= new LongestSubWithoutRepeatingChar();
    }
    @Test
    @DisplayName("Longest substring without repeating characters")
    public void testLongestSubstrWithoutRepeatingChars() {
        String input="abcabcbb";
        int expected=3;

        int result= longestSubWithoutRepeatingChar.findLongestSubstr(input);

        assert(result==expected);
    }
}
