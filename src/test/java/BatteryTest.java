import CarComponents.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before() {
        battery = new Battery("CC22");
    }

    @Test
    public void canGetType() {
        assertEquals("CC22", battery.getType());
    }
}
