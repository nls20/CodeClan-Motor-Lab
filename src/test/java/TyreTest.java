import CarComponents.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre("Michelin");
    }

    @Test
    public void getBrand () {
        assertEquals("Michelin", tyre.getBrand());
    }
}
