package groovy_beans


import org.junit.Test

import static org.junit.Assert.assertEquals;

/**
 * @author Evgeny Borisov
 */
public class PointTest {

    def point = new Point()

    @Test
    public void positiveYCanBeInjected() {
        point.y = 10
        assertEquals(10, point.y)
    }

    @Test(expected = IllegalStateException)
    public void negativeYCannotBeInjected() {
        point.y = -10
    }
}