package lab.null_check

/**
 * @author Evgeny Borisov
 */
class AddressService {
    Map<Integer,Student> students =[:]



    String getStreetNameOfStudentById(int id) {
        students[id]?.address?.streetName
    }

}
