import org.example.SockPairing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SockPairingTest {
    SockPairing sockPairing;

    @BeforeEach
    public void setUp() {
        System.out.println("Hello");
        sockPairing = new SockPairing();
    }

    @Test
    @DisplayName("socks color")
    public void testCountPairing(){
        int[] sockInput={4,7,3,7,4,1,8,7};
        int expected=2;

        int result=sockPairing.countPairing(sockInput);

        assert result==expected;
    }
}