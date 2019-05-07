package never_use_switch

/**
 * @author Evgeny Borisov
 */
class DistributionService {

    private Map<Integer,LetterSender> senderMap = [:]

    DistributionService() {
        senderMap.put(1,new SmsSender())
        senderMap.put(2,new WhatsAppSender())
        senderMap.put(3,new ViberSender())
        senderMap.put(4,new TelegramSender())
    }

    void distribute(Letter letter) {
        def type = letter.distributionType
        def sender = senderMap.getOrDefault(type, new LetterSender(){
            @Override
            void send(Letter l) {
                throw new UnsupportedOperationException("$type not supported")
            }
        })

        sender.send(letter)
    }
}
