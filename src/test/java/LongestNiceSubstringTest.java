import org.example.LongestNiceSubstring;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class LongestNiceSubstringTest {
    LongestNiceSubstring longestNiceSubstring;

    @BeforeEach
    public void setUp() {
        longestNiceSubstring=new LongestNiceSubstring();
    }

    @Test
    @DisplayName("Test the longest nice substring")
    public void testLongestNiceSubstring() {
        String input="YazaAay";
        String expected="aAa";

        String result= longestNiceSubstring.findLongestSubstring(input);

        assert(result.equals(expected));

    }
}
