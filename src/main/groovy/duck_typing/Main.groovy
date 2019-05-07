package duck_typing

import groovy_casting.Person

import java.time.LocalDate


/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def map = ["tuborg":4,"leff":6]
        println(map.tuborg)
        map.put("Makabi",2)
        map["kriek"]=7
        map.corona=5
        println(map)

        def person = new Person(name: "j",age:20)
        def person2 = new Person(name: "j",age:2)
        println(person==person2)
        println(person.is(person2))
        def person3 = person + person2
        println(person3)
        def now = LocalDate.now()
        println(--now)

    }
}










