package never_use_switch

import com.github.javafaker.Faker
import com.github.javafaker.GameOfThrones

/**
 * @author Evgeny Borisov
 */
class LetterProducer {
    private faker = new Faker().gameOfThrones()

    private DistributionService service = new DistributionService()

    def random = new Random()

    void produce() {
        def letter = new Letter(distributionType: random.nextInt(4) + 1, text: faker.quote())
        service.distribute(letter)
    }

}









