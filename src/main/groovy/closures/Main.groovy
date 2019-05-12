package closures

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def factory = new CreatureFactory()
        def creature = factory.createRandomCreature()
        def creature2 = factory.createRandomCreature()
        creature.kick(creature2)
        creature2.kick(creature)
        println(creature.hp)
        println(creature2.hp)





    }
}
