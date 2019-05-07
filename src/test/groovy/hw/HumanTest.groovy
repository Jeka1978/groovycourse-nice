package hw

import org.junit.After
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

/**
 * @author Evgeny Borisov
 */
public class HumanTest {


    HumanTest() {
        println "test obj was created"

    }



    @Before
    public void setUp() throws Exception {
        println "setup method is working"
    }





    @Test
    void switchWorkOnHuman() {
        def human1 = new Human(names: ['Stark', 'Lanister', 'Moshe'])
        def human2 = new Human(names: ['Miri', 'Cassandra'])
        boolean answer = false
        switch ("Miri") {
            case human1:
                fail()
                break
            case human2:
                answer = true
                break
            default:
                fail()
        }

        assertTrue(answer)

    }


    @Test
    public void testThatAddNameWorks() {
        Human human = new Human()
        human.addName("Moshe")
        assertTrue(human.containsName("Moshe"))

        human = new Human(names: ['Jack', 'Nir'])
        human.addName("Moshe")
        assertTrue(human.containsName("Moshe"))
    }

    @Test
    public void ifWorksCorrectly() {
        def human = new Human(names: ['jack', 'jeka', 'john'])
        boolean answer1 = false
        boolean answer2 = false
        if (human) {
            answer1 = true
        }
        assertTrue(answer1)
        human = new Human()
        if (human) {
            answer2 = true
        }
        assertFalse(answer2)


    }

}