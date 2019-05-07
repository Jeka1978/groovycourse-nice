package groovy_casting

/**
 * @author Evgeny Borisov
 */
class Dog implements Animal {

    void bringBall() {
        println("this is your ball, this is alst time I bring it to you")
    }

    @Override
    void makeVoice() {
        println(" gav gav")
    }
}
