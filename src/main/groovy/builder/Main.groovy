package builder

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def soldier = Soldier.builder().setName("Moshe").setAge(12).build()
        println(soldier)
    }
}
