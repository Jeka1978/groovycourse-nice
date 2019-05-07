package never_use_switch

/**
 * @author Evgeny Borisov
 */
class WhatsAppSender implements LetterSender {
    void send(Letter letter) {
        //50 lines of code to send by whatsapp
        println(letter.text+" was sent by whatsapp")
    }
}
