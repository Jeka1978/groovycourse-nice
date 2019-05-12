package closures

/**
 * @author Evgeny Borisov
 */
class Troll extends Creature {
    Troll() {
        hp=200
    }

    @Override
    void kick(Creature creature) {
       creature.hp=0
    }
}
