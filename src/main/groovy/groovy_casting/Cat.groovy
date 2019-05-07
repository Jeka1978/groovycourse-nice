package groovy_casting

/**
 * @author Evgeny Borisov
 */
class Cat implements groovy_casting.Animal {
    @Override
    void makeVoice() {
        println("mau mau")
    }
}
