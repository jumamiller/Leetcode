import org.example.PalindromeNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    PalindromeNumber palindromeNumber;

    @BeforeEach
    public void setUp() {
        palindromeNumber = new PalindromeNumber();
    }
    @Test
    @DisplayName("Palindromic number")
    public void testIsPalindrome() {
        int input=121;
        boolean expected=true;

        boolean result=palindromeNumber.isPalindrome(input);

        assert(result==expected);
    }
}
