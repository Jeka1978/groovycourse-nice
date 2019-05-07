package java8_style

import groovy.transform.TupleConstructor

/**
 * @author Evgeny Borisov
 */
@TupleConstructor
enum Maturity {
    JUNIOR(0,10),
    MIDDLE(11,20),
    SENIOR(21,Integer.MAX_VALUE)
    int min
    int max

   static Maturity bySalary(int salary){
        values().findAll{it.min<salary && salary < it.max}.first()
    }
}