import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before() throws Exception {
        hybridCar = new HybridCar("Yellow", 500.00);
    }

    @Test
    public void canGetColor() {
        assertEquals("Yellow", hybridCar.getColor());
    }

    @Test
    public void canGetPrice() {
        assertEquals(500.00, hybridCar.getPrice(), 0.0);
    }
}
