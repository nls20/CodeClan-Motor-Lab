import CarComponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("V8");
    }

    @Test
    public void canGetType() {
        assertEquals("V8", engine.getType());
    }
}
