import org.example.ValidAnagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {
    ValidAnagram validAnagram;

    @BeforeEach
    public void setUp() {
        validAnagram= new ValidAnagram();
    }
    @Test
    @DisplayName("Is valid anagram")
    public void testIsAnagram() {
        String sInput="anagram";
        String tInput="nagaram";

        boolean expected=true;

        boolean result= validAnagram.isAnagramHashTable(sInput,tInput);

        assert result==expected;
    }
}
