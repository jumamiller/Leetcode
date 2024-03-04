import org.example.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    BinarySearch binarySearch;

    @BeforeEach
    public void setUp() {
        binarySearch =  new BinarySearch();
    }
    @Test
    @DisplayName("Binary Search")
    public void testBinarySearch() {
        int[] numsInput={1,2,3,4,5,6,7,8,9,10};
        int xInput=4;

        int expected=3;

        int result= binarySearch.binarySearch(numsInput,xInput,0,numsInput.length-1);

        assert result==expected;
    }
}
