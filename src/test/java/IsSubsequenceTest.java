import org.example.IsSubsequence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {
    IsSubsequence isSubsequence;

    @BeforeEach
    public void setUp() {
        isSubsequence= new IsSubsequence();
    }
    @Test
    @DisplayName("Is subsequence")
    public void testCheckIfSubsequence() {
//        String s="acb";
        String s="acb";
        String t="ahbgdc";

        boolean expected=false;

        boolean result=isSubsequence.checkIfSubsequence(s,t);

        assert(result==expected);
    }
}
