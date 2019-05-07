package lab1

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def person = new Person()
        def list = [1, 2, 3]
        String s = "abc"
        println(person)
        for (i in person)
            println(i)

    }
}
