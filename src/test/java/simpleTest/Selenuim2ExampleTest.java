package simpleTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by junxu6 on 2016/6/28.
 */
public class Selenuim2ExampleTest {

    Selenuim2Example example;

    @Before
    public void setup() {
        example = new Selenuim2Example();
    }

    @After
    public void end() {

    }

    @Test
    public void simpleTestTest() {
        example.simpleTest();
    }
}
