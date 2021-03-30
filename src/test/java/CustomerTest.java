import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before () {
        customer = new Customer("John", 40.00);
    }

    @Test
    public void canGetName() {
        assertEquals("John", customer.getName());
    }

    @Test
    public void canGetMoney() {
        assertEquals(40.00, customer.getMoney(), 0.0);
    }

    @Test
    public void canCheckOwnedVehiclesListSize() {
        assertEquals(0, customer.getOwnedVehicles());
    }
}
