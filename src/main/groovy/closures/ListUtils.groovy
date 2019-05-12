package closures


/**
 * @author Evgeny Borisov
 */
class ListUtils {
    static void forEachWithDelay(List list, int delay, Closure c) {
        list.each {
            c(it,1)
            sleep(delay)
        }
    }

    public static void main(String[] args) {
        forEachWithDelay([1,2,3,4],500){println(it)}
    }
}
