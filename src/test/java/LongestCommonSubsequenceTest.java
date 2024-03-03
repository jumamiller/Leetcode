import org.example.LongestCommonSubsequence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTest {
    LongestCommonSubsequence longestCommonSubsequence;
    @BeforeEach
    public void setUp() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }
    @Test
    @DisplayName("Longest common substring")
    public void testLongestCommonSubstring() {
        String input1="abcde";
        String input2="ace";
        int expected=3;

        int result= longestCommonSubsequence.lcs(input1,input2);

        assert (result==expected);
    }

}
