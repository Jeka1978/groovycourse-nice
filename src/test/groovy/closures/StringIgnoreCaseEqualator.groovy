package closures

/**
 * @author Evgeny Borisov
 */
class StringIgnoreCaseEqualator implements Equalator<String> {
    @Override
    boolean equals(String t1, String t2) {
        return t1.equalsIgnoreCase(t2)
    }
}
