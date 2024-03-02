import org.example.LengthOfLastWord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class LengthOfLastWordTest {
    LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    public void setUp(){
        lengthOfLastWord=new LengthOfLastWord();
    }
    @Test
    @DisplayName("Calculate the length of the last word")
    public void testFindLengthOfLastWord() {
        String words="Hello World";
        int expected=5;

        int result= lengthOfLastWord.findLengthOfLastWord(words);

        assert(result==expected);
    }
}
