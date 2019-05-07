package lab.null_check

import org.junit.Assert
import org.junit.Test

/**
 * @author Evgeny Borisov
 */
public class AddressServiceTest {


    public static final String HERTZEL = 'hertzel'

    @Test
    public void getStreetNameOfStudentById() {


        def service = new AddressService(students: [1: new Student(name: 'Moshe', address: new Address(streetName: HERTZEL))]
        def streetName = service.getStreetNameOfStudentById(1)
        Assert.assertEquals(HERTZEL,streetName)
    }
}