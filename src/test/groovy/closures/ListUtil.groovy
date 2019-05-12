package closures

import groovy_casting.Animal
import groovy_casting.Cat
import groovy_casting.Dog
import groovy_casting.Person

/**
 * @author Evgeny Borisov
 */
class ListUtil {
    static <T> int countDuplicates(T t, List<T> list,Closure closure) {
        int counter = 0
        for (T obj in list) {
            if(closure)
            if (closure.call(t,obj)) {
                counter++
            }
        }
        counter
    }


    public static void main(String[] args) {
        List<String> names = ['Lanister','Sersii',"Therion","Pink Floyd"]
        def duplicates = countDuplicates("pink floyd", names){
            t1,t2 -> return t1.equalsIgnoreCase(t2)

        }
        println "duplicates = $duplicates"
    }
}
