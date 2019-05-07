package groovy_casting

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def doctor = new AnimalDoctor()
        def dog = new Dog()
//        def cat = new Cat()
        doctor.treat(dog)
//        doctor.treat(cat)
    }
}
