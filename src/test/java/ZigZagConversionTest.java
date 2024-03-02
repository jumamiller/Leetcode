import org.example.ZigZagConversion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ZigZagConversionTest {

    ZigZagConversion zigZagConversion;
    @BeforeEach
    public void setUp() {
        zigZagConversion= new ZigZagConversion();
    }
    @Test
    @DisplayName("Zigzag conversion tests")
    public void testZigZagConversion() {
        String input="PAYPALISHIARING";
        String expected="PAHNAPLSIIGYIR";
        int numRows=3;

        String result=zigZagConversion.convert(input,numRows);
        assert(result.equals(expected));
    }
}
