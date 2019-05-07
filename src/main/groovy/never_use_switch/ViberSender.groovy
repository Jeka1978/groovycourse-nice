package never_use_switch

/**
 * @author Evgeny Borisov
 */
class ViberSender implements LetterSender {
    void send(Letter letter) {
        println("$letter.text send by viber"  )
    }
}
