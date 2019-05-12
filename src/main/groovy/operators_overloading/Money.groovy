package operators_overloading

import groovy.json.JsonSlurper

/**
 * @author Evgeny Borisov
 */
class Money {
    int amount
    String currency

    Money plus(Money money) {
        money.each {}
        if (money.currency == currency) {
            return new Money(amount: amount + money.amount, currency: currency)
        } else {
            def json = new JsonSlurper().parseText(new URL("http://rate-exchange-1.appspot.com/currency?from=$money.currency&to=$currency").getText())
            double rate = json.rate
            return new Money(currency: currency,amount: amount+money.amount*rate)
        }
    }
}
