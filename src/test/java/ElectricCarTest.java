import Vehicles.Car;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before () throws Exception {
        electricCar = new ElectricCar("blue", 200.00);
    }

    @Test
    public void canGetColor () {
        assertEquals("blue", electricCar.getColor());
    }

    @Test
    public void canGetPrice () {
        assertEquals(200.00, electricCar.getPrice(), 0.0);
    }
}
