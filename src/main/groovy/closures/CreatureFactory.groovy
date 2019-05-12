package closures

/**
 * @author Evgeny Borisov
 */
class CreatureFactory {

    List<Closure> creaturesBuilders = [{new Hobbit() }, { new Elf() }, {TrollBuilder.closureForBuildingTroll()}]
    def random = new Random()

    Creature createRandomCreature() {
        def i = random.nextInt(creaturesBuilders.size())
        creaturesBuilders[i]()
    }
}
