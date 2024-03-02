import org.example.LongestPalindromicSubseq;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubseqTest {
    LongestPalindromicSubseq longestPalindromicSubseq;

    @BeforeEach
    public void setUp() {
        longestPalindromicSubseq= new LongestPalindromicSubseq();
    }
    @Test
    @DisplayName("Longest palindromic subsequent")
    public void testLongestPalindromicSubsequent() {
        String input="cbba";
        int expected=2;

        int result= longestPalindromicSubseq.longestPalindromeSubseq(input);
        assert(result==expected);
    }
}
