import Vehicles.GasCar;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasCarTest {

    GasCar gasCar;

    @Before
    public void before() throws Exception {
        gasCar = new GasCar("Yellow", 500.00);
    }

    @Test
    public void canGetColor() {
        assertEquals("Yellow", gasCar.getColor());
    }

    @Test
    public void canGetPrice() {
        assertEquals(500.00, gasCar.getPrice(), 0.0);
    }
}
