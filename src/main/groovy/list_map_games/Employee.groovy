package list_map_games

import groovy.transform.Canonical

/**
 * @author Evgeny Borisov
 */
@Canonical
class Employee {
    String name
    int salary

    private Map<String,String> props = [:]

    def methodMissing(String name, def args) {
        println("run")
    }
}
