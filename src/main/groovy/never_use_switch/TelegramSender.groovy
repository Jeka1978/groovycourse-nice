package never_use_switch

/**
 * @author Evgeny Borisov
 */
class TelegramSender implements LetterSender {
    void send(Letter letter) {
        println("$letter.text send by telegram"  )
    }
}
