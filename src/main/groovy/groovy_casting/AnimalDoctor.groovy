package groovy_casting

/**
 * @author Evgeny Borisov
 */
class AnimalDoctor {
    void treat(Animal animal) {
        Cat cat = animal
        cat.makeVoice()
    }
}
