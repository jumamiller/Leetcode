import org.example.ValidPalindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome;

    @BeforeEach
    public void setUp()
    {
        validPalindrome= new ValidPalindrome();
    }
    @Test
    @DisplayName("Is Valid palindrome")
    public void testCheckValidPalindrome() {
        String input="A man, a plan, a canal: Panama";
        boolean expected=true;

        boolean result= validPalindrome.checkValidPalindrome(input);

        assert(result==expected);
    }
    @Test
    @DisplayName("A valid Palindrome after deleting at most one character from it")
    public void testValidPalindromeOnCharacterDeletion() {
        String input="abca";
        boolean expected=true;

        boolean result=validPalindrome.validPalindromeOnCharacterDeletion(input);

        assert(result==expected);
    }
}
