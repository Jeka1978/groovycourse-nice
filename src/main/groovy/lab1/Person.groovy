package lab1

import groovy.transform.Canonical


/**
 * @author Evgeny Borisov
 */
@Canonical
class Person {
    int age


    boolean asBoolean(){
        age < 120
    }

    Iterator iterator(){
        [1,2,3,4].iterator()
    }

}
