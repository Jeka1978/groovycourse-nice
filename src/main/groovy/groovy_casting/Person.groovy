package groovy_casting

import groovy.transform.Canonical
import groovy.transform.ToString
import lombok.EqualsAndHashCode

/**
 * @author Evgeny Borisov
 */
@Canonical
class Person {
    String name
    int age

    Person plus(Person p2) {
        new Person(name: this.name+p2.name,age: this.age*p2.age)
    }

}
