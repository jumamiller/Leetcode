import org.example.AnagramInString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AnagramInStringTest {
    AnagramInString anagramInString;

    @BeforeEach
    public void setUp() {
        anagramInString =  new AnagramInString();
    }
    @Test
    @DisplayName("Find All Anagrams in a String")
    public void testFindAnagrams() {
        String sInput="cbaebabacd";
        String pInput="abc";

        List<Integer> expected=List.of(0,6);

        List<Integer> result=anagramInString.findAnagrams(sInput,pInput);

        assert result.equals(expected);
    }
}
