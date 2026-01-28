package repository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FlyBehaviorTest {

    @Test
    void flyWithWingsTest() {
        FlyBehavior fly = new FlyWithWings();
        assertEquals("I'm flying with wings!", fly.fly());
    }

    @Test
    void flyNoWayTest() {
        FlyBehavior fly = new FlyNoWay();
        assertEquals("I can't fly.", fly.fly());
    }
}
