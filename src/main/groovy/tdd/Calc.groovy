package tdd

/**
 * @author Evgeny Borisov
 */
class Calc {
    def maamResolver

    double withMaam(double price) {
        price*maamResolver.getMaam()+price
    }
}
