package hw

/**
 * @author Evgeny Borisov
 */
class Human {
    List<String> names = []


    boolean isCase(String oneOfTheNames) {
        names.contains(oneOfTheNames)
    }

    boolean asBoolean() {
        !names.isEmpty()
    }

    void addName(String name) {
        names.add(name)
    }

    boolean containsName(String name) {
        names.contains(name)
    }


}