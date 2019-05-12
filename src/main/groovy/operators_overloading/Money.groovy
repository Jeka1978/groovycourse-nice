package operators_overloading

import groovy.json.JsonSlurper
import groovy.transform.Canonical

/**
 * @author Evgeny Borisov
 */
@Canonical
class Money implements Comparable<Money>{
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

    @Override
    int compareTo(Money otherMoney) {
        return amount-otherMoney.amount
    }

    Money next(){
        return new Money(amount: amount+1,currency: currency)
    }
    Money previous(){
        return new Money(amount: amount-1,currency: currency)
    }
}
