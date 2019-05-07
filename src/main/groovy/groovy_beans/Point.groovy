package groovy_beans


import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder

/**
 * @author Evgeny Borisov
 */
@TupleConstructor
@Builder
class Point {
    int x
    int y


    private int xRetrieveCounter

    int getX() {
        xRetrieveCounter++
        return x
    }

    void setY(int y) {

        if (y < 0) throw new IllegalStateException("y can't be negative")
        this.y = y
    }

    void setX(int x) {
        xRetrieveCounter++
        if (x < 0) throw new IllegalStateException("x can't be negative")
        this.x = x
    }
}
