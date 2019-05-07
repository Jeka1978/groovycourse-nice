package never_use_switch

/**
 * @author Evgeny Borisov
 */
class Start {
    public static void main(String[] args) {
        def producer = new LetterProducer()
        while (true) {
            producer.produce()
            Thread.sleep(1000)
        }
    }
}
