package list_map_games


import groovy.transform.TupleConstructor

/**
 * @author Evgeny Borisov
 */

@TupleConstructor
enum Seniority {
    JUNIOR(0, 10),
    MIDDLE(11, 20),
    SENIOR(21, Integer.MAX_VALUE)

    int min
    int max

    //@TupleConstructor will generate this constructor
   /* Seniority(int min, int max) {
        this.min = min
        this.max = max
    }*/

    static Seniority bySalary(int salary) {
        def seniorities = values()
        seniorities.find { it.min < salary && salary < it.max }
    }



}


