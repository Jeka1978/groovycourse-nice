package never_use_switch

/**
 * @author Evgeny Borisov
 */
class SmsSender implements LetterSender {
    void send(Letter letter) {
        //40 lines of code to send by sms
        println(letter.text+" was sent by sms")
    }
}
