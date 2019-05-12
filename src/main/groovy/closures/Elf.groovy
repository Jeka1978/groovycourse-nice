package closures

/**
 * @author Evgeny Borisov
 */
class Elf extends Creature {
    {
        hp=35
    }
    @Override
    void kick(Creature creature) {
       creature.hp-=10
    }
}
