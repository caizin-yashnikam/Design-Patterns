package repository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuackBehaviorTest {

    @Test
    void quackTest() {
        QuackBehavior quack = new Quack();
        assertEquals("Quack!", quack.quack());
    }

    @Test
    void squeakTest() {
        QuackBehavior squeak = new Squeak();
        assertEquals("Squeak!", squeak.quack());
    }

    @Test
    void muteQuackTest() {
        QuackBehavior mute = new MuteQuack();
        assertEquals("<< Silence >>", mute.quack());
    }
}
