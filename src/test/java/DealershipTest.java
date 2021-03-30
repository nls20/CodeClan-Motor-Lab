import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void before () {
        dealership = new Dealership(2000);
    }

    @Test
    public void canGetTill() {
        assertEquals(2000, dealership.getTill(), 0.0);
    }
}
