package builder

import groovy.transform.Canonical
import groovy.transform.ToString
import groovy.transform.TypeChecked
import groovy.transform.builder.Builder

/**
 * @author Evgeny Borisov
 */
@ToString
class Soldier {
    String name
    int age

    static Builder builder(){
        return new Builder()
    }

    static class Builder {
        String name
        int age


        Builder setName(String name) {
            this.name = name
            return this
        }



        Builder setAge(int age) {
            this.age = age
            return this
        }

        Soldier build() {
            if (age == 0) throw new IllegalStateException("age can't be 0")
            if (name == null) throw new IllegalStateException("name can't be null")
            return new Soldier(name: name, age: age)
        }
    }

}
