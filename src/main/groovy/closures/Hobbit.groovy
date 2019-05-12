package closures

/**
 * @author Evgeny Borisov
 */
class Hobbit extends Creature {

    Hobbit() {
        hp = 25
    }

    @Override
    void kick(Creature creature) {
        println("Don't kill me!!!")
    }
}
