package closures

import groovy.transform.Canonical

/**
 * @author Evgeny Borisov
 */
@Canonical
class Person {
    String name
    int age


    public static void main(String[] args) {
        def list = [
                new Person(name: 'Moshe', age: 20),
                new Person(name: 'Masha', age: 59),
                new Person(name: 'Masha', age: 19),
                new Person(name: 'Misha', age: 25)
        ]


        list.sort { p1, p2 ->

           return p1.name <=> p2.name ?: p1.age-p2.age
        }

        println(list)

    }


}
