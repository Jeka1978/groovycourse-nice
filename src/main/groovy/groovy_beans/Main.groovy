package groovy_beans

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def point = new Point(x:2,y:3)
        point.@x=2
        point.x=1
        println(point.xRetrieveCounter)

    }
}
