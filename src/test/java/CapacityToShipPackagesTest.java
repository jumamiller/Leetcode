import org.example.CapacityToShipPackages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CapacityToShipPackagesTest {

    CapacityToShipPackages capacityToShipPackages;

    @BeforeEach
    public void setUp() {
        capacityToShipPackages = new CapacityToShipPackages();
    }

    @Test
    @DisplayName("Capacity To Ship Packages Within D Days")
    public void testShipWithinDays() {
        int[] inputWeights={1,2,3,4,5,6,7,8,9,10};
        int days=5;

        int expected=15;

        int result= capacityToShipPackages.shipWithinDays(inputWeights,days);

        assert result==expected;
    }
}
